parser grammar ConnectorParser;

options
   { tokenVocab = ConnectorLexer; }

stat
   : select_clause
   ;

into
   : INTO
   ;

pk
   : PK
   ;

insert_into
   : INSERT into
   ;

upsert_into
   : UPSERT into
   ;

upsert_pk_into
   : UPSERT pk ID into
   ;

sql_action
   : insert_into | upsert_into | upsert_pk_into
   ;

schema_name
   : ID
   ;

select_clause
   : sql_action table_name SELECT column_list_clause FROM topic_name ( IGNORE ignore_clause )?
   ;

topic_name
   : ID
   ;

table_name
   : ID
   ;

column_name
   : ID ( AS column_name_alias )? | ASTERISK
   ;

column_name_alias
   : ID
   ;


column_list
   : column_name ( COMMA column_name )*
   ;

column_list_clause
   : column_name ( COMMA column_name )*
   ;

from_clause
   : FROM table_name
   ;

ignored_name
   : ID
   ;

ignore_clause
   : ignored_name ( COMMA ignored_name )*
   ;