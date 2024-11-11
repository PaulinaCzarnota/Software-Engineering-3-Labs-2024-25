CREATE TABLE user (
  ID int(11) NOT NULL AUTO_INCREMENT,
  FIRST_NAME varchar(50) NOT NULL,
  LAST_NAME varchar(50) NOT NULL,
  USERNAME varchar(20) NOT NULL,
  PASSWORD varchar(20) NOT NULL,
  PRIMARY KEY  (ID)
  );
  
  INSERT INTO user VALUES (null, "John", "Smith", "smithj", "password"),
  						  (null, "Mary", "Byrne", "byrnem", "password"),
  						  (null, "Frankie", "Cocozza", "cocozzaf", "password"),
  						  (null, "Patrick", "Jones", "jonesp", "password");
