package io.confluent.kafka.connect.cdc.xstream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

@Disabled
public class Oracle11gKeyMetadataProviderTests extends Oracle11gTest {
  private static final Logger log = LoggerFactory.getLogger(Oracle11gKeyMetadataProviderTests.class);

  Connection connection;


  @BeforeEach
  public void before() throws SQLException {
//    this.connection = Utils.openConnection(jdbcUrl, DockerUtils.USERNAME, DockerUtils.PASSWORD);
//    this.keyMetadataProvider = new Oracle11gKeyMetadataProvider(this.connection);
  }

  @Test
  public void test() {

  }

//  @Test
//  public void findPrimaryKey() throws SQLException {
//    Set<String> expectedKeys = ImmutableSet.of("USER_ID");
//    Set<String> actualKeys = this.keyMetadataProvider.findPrimaryKey("CDC_TESTING", "PRIMARY_KEY_TABLE");
//    assertEquals(actualKeys, expectedKeys, "actualKeys did not match.");
//
//    expectedKeys = ImmutableSet.of();
//    actualKeys = this.keyMetadataProvider.findPrimaryKey("CDC_TESTING", "UNIQUE_INDEX_TABLE");
//    assertEquals(actualKeys, expectedKeys, "actualKeys did not match.");
//  }
//
//  @Test
//  public void findUniqueKey() throws SQLException {
//    Set<String> expectedKeys = ImmutableSet.of("FIRST_COLUMN", "SECOND_COLUMN");
//    Set<String> actualKeys = this.keyMetadataProvider.findUniqueKey("cdc_testing", "UNIQUE_INDEX_TABLE");
//    assertEquals(actualKeys, IsEqual.equalTo(expectedKeys), "actualKeys did not match.");
//
//    expectedKeys = ImmutableSet.of();
//    actualKeys = this.keyMetadataProvider.findUniqueKey("CDC_TESTING", "NO_INDEXES");
//    assertEquals(actualKeys, expectedKeys, "actualKeys did not match.");
//  }
//
//  @Test
//  public void findKeys() throws SQLException {
//    Set<String> expectedKeys = ImmutableSet.of("FIRST_COLUMN", "SECOND_COLUMN");
//    Set<String> actualKeys = this.keyMetadataProvider.findKeys("cdc_testing", "UNIQUE_INDEX_TABLE");
//    assertEquals(actualKeys, expectedKeys, "actualKeys did not match.");
//  }
}
