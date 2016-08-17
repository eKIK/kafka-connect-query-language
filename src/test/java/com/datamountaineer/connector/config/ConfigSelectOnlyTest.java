package com.datamountaineer.connector.config;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class ConfigSelectOnlyTest {

  @Test
  public void parseASelectAllFromTopic() {
    String topic = "TOPIC_A";
    String syntax = String.format("SELECT * FROM %s", topic);
    Config config = Config.parse(syntax);
    assertEquals(topic, config.getSource());
    assertNull(config.getTarget());
    assertFalse(config.getFieldAlias().hasNext());
    assertTrue(config.isIncludeAllFields());
    HashSet<String> pks = new HashSet<>();
    Iterator<String> iter = config.getPrimaryKeys();
    while (iter.hasNext()) {
      pks.add(iter.next());
    }
    assertEquals(0, pks.size());
    assertNull(config.getConsumerGroup());
  }

  @Test
  public void parseASelectAllFromTopicWithAConsumerGroup() {
    String topic = "TOPIC_A";
    String expectedConsumerGroup = "myconsumer-group";
    String syntax = String.format("SELECT * FROM %s WITHGROUP %s", topic, expectedConsumerGroup);
    Config config = Config.parse(syntax);
    assertEquals(topic, config.getSource());
    assertNull(config.getTarget());
    assertFalse(config.getFieldAlias().hasNext());
    assertTrue(config.isIncludeAllFields());
    HashSet<String> pks = new HashSet<>();
    Iterator<String> iter = config.getPrimaryKeys();
    while (iter.hasNext()) {
      pks.add(iter.next());
    }
    assertEquals(0, pks.size());
    assertEquals(expectedConsumerGroup, config.getConsumerGroup());
  }

  @Test
  public void parseASelectAllFromTopicWithAConsumerGroup123() {
    String topic = "TOPIC_A";
    String expectedConsumerGroup = "123";
    String syntax = String.format("SELECT * FROM %s WITHGROUP %s", topic, expectedConsumerGroup);
    Config config = Config.parse(syntax);
    assertEquals(topic, config.getSource());
    assertNull(config.getTarget());
    assertFalse(config.getFieldAlias().hasNext());
    assertTrue(config.isIncludeAllFields());
    HashSet<String> pks = new HashSet<>();
    Iterator<String> iter = config.getPrimaryKeys();
    while (iter.hasNext()) {
      pks.add(iter.next());
    }
    assertEquals(0, pks.size());
    assertEquals(expectedConsumerGroup, config.getConsumerGroup());
  }

  @Test
  public void parseASelectAllFromTopicWithMultiplePartitionsAndOffset() {
    String topic = "TOPIC_A";
    Long expectedOffset1 = 1L;
    int partition1 = 2;

    Long expectedOffset2 = 1252L;
    int partition2 = 0;

    String syntax = String.format("SELECT * FROM %s WITHOFFSET (%d,%d), (%d,%d)",
            topic, partition1, expectedOffset1, partition2, expectedOffset2);
    Config config = Config.parse(syntax);
    assertEquals(topic, config.getSource());
    assertNull(config.getTarget());
    assertFalse(config.getFieldAlias().hasNext());
    assertTrue(config.isIncludeAllFields());
    HashSet<String> pks = new HashSet<>();
    Iterator<String> iter = config.getPrimaryKeys();
    while (iter.hasNext()) {
      pks.add(iter.next());
    }
    assertEquals(0, pks.size());

    List<PartitionOffset> partitionOffsets = config.getPartitonOffset();
    assertNotNull(partitionOffsets);
    assertEquals(2, partitionOffsets.size());

    PartitionOffset po1 = partitionOffsets.get(0);

    assertEquals(partition1, po1.getPartition());
    assertEquals(expectedOffset1, po1.getOffset());

    PartitionOffset po2 = partitionOffsets.get(1);
    assertEquals(partition2, po2.getPartition());
    assertEquals(expectedOffset2, po2.getOffset());

  }

  @Test
  public void parseASelectAllFromTopicWithJustPartitionNoOffset() {
    String topic = "TOPIC_A";

    String syntax = String.format("SELECT * FROM %s WITHOFFSET (0)", topic);
    Config config = Config.parse(syntax);
    assertEquals(topic, config.getSource());
    assertNull(config.getTarget());
    assertFalse(config.getFieldAlias().hasNext());
    assertTrue(config.isIncludeAllFields());
    HashSet<String> pks = new HashSet<>();
    Iterator<String> iter = config.getPrimaryKeys();
    while (iter.hasNext()) {
      pks.add(iter.next());
    }
    assertEquals(0, pks.size());
    assertNotNull(config.getPartitonOffset());
    assertEquals(1, config.getPartitonOffset().size());
    PartitionOffset po = config.getPartitonOffset().get(0);
    assertEquals(0, po.getPartition());
    assertNull(po.getOffset());
  }


  @Test
  public void parseASelectWithAliasingFields() {
    String topic = "TOPIC-A";
    String syntax = String.format("SELECT f1 as col1, f2 as col2 FROM %s", topic);
    Config config = Config.parse(syntax);
    assertEquals(topic, config.getSource());
    assertNull(config.getTarget());
    List<FieldAlias> fa = Lists.newArrayList(config.getFieldAlias());
    Map<String, FieldAlias> map = new HashMap<>();
    for (FieldAlias alias : fa) {
      map.put(alias.getField(), alias);
    }
    assertEquals(2, fa.size());
    assertTrue(map.containsKey("f1"));
    assertEquals("col1", map.get("f1").getAlias());
    assertTrue(map.containsKey("f2"));
    assertEquals("col2", map.get("f2").getAlias());
    assertFalse(config.isIncludeAllFields());
  }


  @Test
  public void parseASelectWithAMixOfAliasing() {
    String topic = "TOPIC.A";
    String syntax = String.format("SELECT f1 as col1, f3, f2 as col2,f4 FROM %s", topic);
    Config config = Config.parse(syntax);
    assertEquals(topic, config.getSource());
    assertNull(config.getTarget());
    List<FieldAlias> fa = Lists.newArrayList(config.getFieldAlias());
    Map<String, FieldAlias> map = new HashMap<>();
    for (FieldAlias alias : fa) {
      map.put(alias.getField(), alias);
    }
    assertEquals(4, fa.size());
    assertTrue(map.containsKey("f1"));
    assertEquals("col1", map.get("f1").getAlias());
    assertTrue(map.containsKey("f2"));
    assertEquals("col2", map.get("f2").getAlias());
    assertTrue(map.containsKey("f3"));
    assertEquals("f3", map.get("f3").getAlias());
    assertTrue(map.containsKey("f4"));
    assertEquals("f4", map.get("f4").getAlias());
    assertFalse(config.isIncludeAllFields());
  }

  @Test(expected = IllegalArgumentException.class)
  public void throwAnExceptionIfTheFromOffsetIsNotAValidNumber() {
    String topic = "TOPIC.A";
    String syntax = String.format("SELECT f1 as col1, f3, f2 as col2,f4 FROM %s WITHOFFSET 11a1", topic);
    Config.parse(syntax);
  }
}
