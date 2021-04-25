// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/autofill_specifics.proto

package org.chromium.components.sync.protocol;

public interface AutofillProfileSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.AutofillProfileSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string guid = 15;</code>
   * @return Whether the guid field is set.
   */
  boolean hasGuid();
  /**
   * <code>optional string guid = 15;</code>
   * @return The guid.
   */
  java.lang.String getGuid();
  /**
   * <code>optional string guid = 15;</code>
   * @return The bytes for guid.
   */
  com.google.protobuf.ByteString
      getGuidBytes();

  /**
   * <code>optional string origin = 16;</code>
   * @return Whether the origin field is set.
   */
  boolean hasOrigin();
  /**
   * <code>optional string origin = 16;</code>
   * @return The origin.
   */
  java.lang.String getOrigin();
  /**
   * <code>optional string origin = 16;</code>
   * @return The bytes for origin.
   */
  com.google.protobuf.ByteString
      getOriginBytes();

  /**
   * <code>optional int64 use_count = 22;</code>
   * @return Whether the useCount field is set.
   */
  boolean hasUseCount();
  /**
   * <code>optional int64 use_count = 22;</code>
   * @return The useCount.
   */
  long getUseCount();

  /**
   * <pre>
   * The time_t value of the last time this profile was used. This
   * value makes sense wrt base::Time::To/FromTimeT, which measures
   * from the Windows epoch.
   * </pre>
   *
   * <code>optional int64 use_date = 23;</code>
   * @return Whether the useDate field is set.
   */
  boolean hasUseDate();
  /**
   * <pre>
   * The time_t value of the last time this profile was used. This
   * value makes sense wrt base::Time::To/FromTimeT, which measures
   * from the Windows epoch.
   * </pre>
   *
   * <code>optional int64 use_date = 23;</code>
   * @return The useDate.
   */
  long getUseDate();

  /**
   * <pre>
   * Contact info name fields.
   * </pre>
   *
   * <code>repeated string name_honorific = 26;</code>
   * @return A list containing the nameHonorific.
   */
  java.util.List<java.lang.String>
      getNameHonorificList();
  /**
   * <pre>
   * Contact info name fields.
   * </pre>
   *
   * <code>repeated string name_honorific = 26;</code>
   * @return The count of nameHonorific.
   */
  int getNameHonorificCount();
  /**
   * <pre>
   * Contact info name fields.
   * </pre>
   *
   * <code>repeated string name_honorific = 26;</code>
   * @param index The index of the element to return.
   * @return The nameHonorific at the given index.
   */
  java.lang.String getNameHonorific(int index);
  /**
   * <pre>
   * Contact info name fields.
   * </pre>
   *
   * <code>repeated string name_honorific = 26;</code>
   * @param index The index of the element to return.
   * @return The nameHonorific at the given index.
   */
  com.google.protobuf.ByteString
      getNameHonorificBytes(int index);

  /**
   * <code>repeated string name_first = 2;</code>
   * @return A list containing the nameFirst.
   */
  java.util.List<java.lang.String>
      getNameFirstList();
  /**
   * <code>repeated string name_first = 2;</code>
   * @return The count of nameFirst.
   */
  int getNameFirstCount();
  /**
   * <code>repeated string name_first = 2;</code>
   * @param index The index of the element to return.
   * @return The nameFirst at the given index.
   */
  java.lang.String getNameFirst(int index);
  /**
   * <code>repeated string name_first = 2;</code>
   * @param index The index of the element to return.
   * @return The nameFirst at the given index.
   */
  com.google.protobuf.ByteString
      getNameFirstBytes(int index);

  /**
   * <code>repeated string name_middle = 3;</code>
   * @return A list containing the nameMiddle.
   */
  java.util.List<java.lang.String>
      getNameMiddleList();
  /**
   * <code>repeated string name_middle = 3;</code>
   * @return The count of nameMiddle.
   */
  int getNameMiddleCount();
  /**
   * <code>repeated string name_middle = 3;</code>
   * @param index The index of the element to return.
   * @return The nameMiddle at the given index.
   */
  java.lang.String getNameMiddle(int index);
  /**
   * <code>repeated string name_middle = 3;</code>
   * @param index The index of the element to return.
   * @return The nameMiddle at the given index.
   */
  com.google.protobuf.ByteString
      getNameMiddleBytes(int index);

  /**
   * <code>repeated string name_last = 4;</code>
   * @return A list containing the nameLast.
   */
  java.util.List<java.lang.String>
      getNameLastList();
  /**
   * <code>repeated string name_last = 4;</code>
   * @return The count of nameLast.
   */
  int getNameLastCount();
  /**
   * <code>repeated string name_last = 4;</code>
   * @param index The index of the element to return.
   * @return The nameLast at the given index.
   */
  java.lang.String getNameLast(int index);
  /**
   * <code>repeated string name_last = 4;</code>
   * @param index The index of the element to return.
   * @return The nameLast at the given index.
   */
  com.google.protobuf.ByteString
      getNameLastBytes(int index);

  /**
   * <pre>
   * Sometimes the last name is composed of two names as it is common for
   * Hispanic/Latinx names. In the unstructured representation of the last name,
   * there may be even a conjunction between the first and the second last
   * name. For example, the more-complete version of Pablo Picasso's surname is
   * "Ruiz y Picasso" containing a first last name, a conjunction (the y) and a
   * second last name.
   * </pre>
   *
   * <code>repeated string name_last_first = 27;</code>
   * @return A list containing the nameLastFirst.
   */
  java.util.List<java.lang.String>
      getNameLastFirstList();
  /**
   * <pre>
   * Sometimes the last name is composed of two names as it is common for
   * Hispanic/Latinx names. In the unstructured representation of the last name,
   * there may be even a conjunction between the first and the second last
   * name. For example, the more-complete version of Pablo Picasso's surname is
   * "Ruiz y Picasso" containing a first last name, a conjunction (the y) and a
   * second last name.
   * </pre>
   *
   * <code>repeated string name_last_first = 27;</code>
   * @return The count of nameLastFirst.
   */
  int getNameLastFirstCount();
  /**
   * <pre>
   * Sometimes the last name is composed of two names as it is common for
   * Hispanic/Latinx names. In the unstructured representation of the last name,
   * there may be even a conjunction between the first and the second last
   * name. For example, the more-complete version of Pablo Picasso's surname is
   * "Ruiz y Picasso" containing a first last name, a conjunction (the y) and a
   * second last name.
   * </pre>
   *
   * <code>repeated string name_last_first = 27;</code>
   * @param index The index of the element to return.
   * @return The nameLastFirst at the given index.
   */
  java.lang.String getNameLastFirst(int index);
  /**
   * <pre>
   * Sometimes the last name is composed of two names as it is common for
   * Hispanic/Latinx names. In the unstructured representation of the last name,
   * there may be even a conjunction between the first and the second last
   * name. For example, the more-complete version of Pablo Picasso's surname is
   * "Ruiz y Picasso" containing a first last name, a conjunction (the y) and a
   * second last name.
   * </pre>
   *
   * <code>repeated string name_last_first = 27;</code>
   * @param index The index of the element to return.
   * @return The nameLastFirst at the given index.
   */
  com.google.protobuf.ByteString
      getNameLastFirstBytes(int index);

  /**
   * <code>repeated string name_last_conjunction = 28;</code>
   * @return A list containing the nameLastConjunction.
   */
  java.util.List<java.lang.String>
      getNameLastConjunctionList();
  /**
   * <code>repeated string name_last_conjunction = 28;</code>
   * @return The count of nameLastConjunction.
   */
  int getNameLastConjunctionCount();
  /**
   * <code>repeated string name_last_conjunction = 28;</code>
   * @param index The index of the element to return.
   * @return The nameLastConjunction at the given index.
   */
  java.lang.String getNameLastConjunction(int index);
  /**
   * <code>repeated string name_last_conjunction = 28;</code>
   * @param index The index of the element to return.
   * @return The nameLastConjunction at the given index.
   */
  com.google.protobuf.ByteString
      getNameLastConjunctionBytes(int index);

  /**
   * <code>repeated string name_last_second = 29;</code>
   * @return A list containing the nameLastSecond.
   */
  java.util.List<java.lang.String>
      getNameLastSecondList();
  /**
   * <code>repeated string name_last_second = 29;</code>
   * @return The count of nameLastSecond.
   */
  int getNameLastSecondCount();
  /**
   * <code>repeated string name_last_second = 29;</code>
   * @param index The index of the element to return.
   * @return The nameLastSecond at the given index.
   */
  java.lang.String getNameLastSecond(int index);
  /**
   * <code>repeated string name_last_second = 29;</code>
   * @param index The index of the element to return.
   * @return The nameLastSecond at the given index.
   */
  com.google.protobuf.ByteString
      getNameLastSecondBytes(int index);

  /**
   * <code>repeated string name_full = 21;</code>
   * @return A list containing the nameFull.
   */
  java.util.List<java.lang.String>
      getNameFullList();
  /**
   * <code>repeated string name_full = 21;</code>
   * @return The count of nameFull.
   */
  int getNameFullCount();
  /**
   * <code>repeated string name_full = 21;</code>
   * @param index The index of the element to return.
   * @return The nameFull at the given index.
   */
  java.lang.String getNameFull(int index);
  /**
   * <code>repeated string name_full = 21;</code>
   * @param index The index of the element to return.
   * @return The nameFull at the given index.
   */
  com.google.protobuf.ByteString
      getNameFullBytes(int index);

  /**
   * <pre>
   * Validation status records for name fields.
   * </pre>
   *
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_honorific_status = 30;</code>
   * @return A list containing the nameHonorificStatus.
   */
  java.util.List<org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus> getNameHonorificStatusList();
  /**
   * <pre>
   * Validation status records for name fields.
   * </pre>
   *
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_honorific_status = 30;</code>
   * @return The count of nameHonorificStatus.
   */
  int getNameHonorificStatusCount();
  /**
   * <pre>
   * Validation status records for name fields.
   * </pre>
   *
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_honorific_status = 30;</code>
   * @param index The index of the element to return.
   * @return The nameHonorificStatus at the given index.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getNameHonorificStatus(int index);

  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_first_status = 31;</code>
   * @return A list containing the nameFirstStatus.
   */
  java.util.List<org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus> getNameFirstStatusList();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_first_status = 31;</code>
   * @return The count of nameFirstStatus.
   */
  int getNameFirstStatusCount();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_first_status = 31;</code>
   * @param index The index of the element to return.
   * @return The nameFirstStatus at the given index.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getNameFirstStatus(int index);

  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_middle_status = 32;</code>
   * @return A list containing the nameMiddleStatus.
   */
  java.util.List<org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus> getNameMiddleStatusList();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_middle_status = 32;</code>
   * @return The count of nameMiddleStatus.
   */
  int getNameMiddleStatusCount();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_middle_status = 32;</code>
   * @param index The index of the element to return.
   * @return The nameMiddleStatus at the given index.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getNameMiddleStatus(int index);

  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_status = 33;</code>
   * @return A list containing the nameLastStatus.
   */
  java.util.List<org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus> getNameLastStatusList();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_status = 33;</code>
   * @return The count of nameLastStatus.
   */
  int getNameLastStatusCount();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_status = 33;</code>
   * @param index The index of the element to return.
   * @return The nameLastStatus at the given index.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getNameLastStatus(int index);

  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_first_status = 34;</code>
   * @return A list containing the nameLastFirstStatus.
   */
  java.util.List<org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus> getNameLastFirstStatusList();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_first_status = 34;</code>
   * @return The count of nameLastFirstStatus.
   */
  int getNameLastFirstStatusCount();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_first_status = 34;</code>
   * @param index The index of the element to return.
   * @return The nameLastFirstStatus at the given index.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getNameLastFirstStatus(int index);

  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_conjunction_status = 35;</code>
   * @return A list containing the nameLastConjunctionStatus.
   */
  java.util.List<org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus> getNameLastConjunctionStatusList();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_conjunction_status = 35;</code>
   * @return The count of nameLastConjunctionStatus.
   */
  int getNameLastConjunctionStatusCount();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_conjunction_status = 35;</code>
   * @param index The index of the element to return.
   * @return The nameLastConjunctionStatus at the given index.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getNameLastConjunctionStatus(int index);

  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_second_status = 36;</code>
   * @return A list containing the nameLastSecondStatus.
   */
  java.util.List<org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus> getNameLastSecondStatusList();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_second_status = 36;</code>
   * @return The count of nameLastSecondStatus.
   */
  int getNameLastSecondStatusCount();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_last_second_status = 36;</code>
   * @param index The index of the element to return.
   * @return The nameLastSecondStatus at the given index.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getNameLastSecondStatus(int index);

  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_full_status = 37;</code>
   * @return A list containing the nameFullStatus.
   */
  java.util.List<org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus> getNameFullStatusList();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_full_status = 37;</code>
   * @return The count of nameFullStatus.
   */
  int getNameFullStatusCount();
  /**
   * <code>repeated .sync_pb.AutofillProfileSpecifics.VerificationStatus name_full_status = 37;</code>
   * @param index The index of the element to return.
   * @return The nameFullStatus at the given index.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getNameFullStatus(int index);

  /**
   * <pre>
   * Contact info additional fields.
   * </pre>
   *
   * <code>repeated string email_address = 5;</code>
   * @return A list containing the emailAddress.
   */
  java.util.List<java.lang.String>
      getEmailAddressList();
  /**
   * <pre>
   * Contact info additional fields.
   * </pre>
   *
   * <code>repeated string email_address = 5;</code>
   * @return The count of emailAddress.
   */
  int getEmailAddressCount();
  /**
   * <pre>
   * Contact info additional fields.
   * </pre>
   *
   * <code>repeated string email_address = 5;</code>
   * @param index The index of the element to return.
   * @return The emailAddress at the given index.
   */
  java.lang.String getEmailAddress(int index);
  /**
   * <pre>
   * Contact info additional fields.
   * </pre>
   *
   * <code>repeated string email_address = 5;</code>
   * @param index The index of the element to return.
   * @return The emailAddress at the given index.
   */
  com.google.protobuf.ByteString
      getEmailAddressBytes(int index);

  /**
   * <code>optional string company_name = 6;</code>
   * @return Whether the companyName field is set.
   */
  boolean hasCompanyName();
  /**
   * <code>optional string company_name = 6;</code>
   * @return The companyName.
   */
  java.lang.String getCompanyName();
  /**
   * <code>optional string company_name = 6;</code>
   * @return The bytes for companyName.
   */
  com.google.protobuf.ByteString
      getCompanyNameBytes();

  /**
   * <pre>
   * Address field.
   * The address_home_line1/2 fields are deprecated and
   * address_home_street_address should be used instead by
   * joining address_home_line1/2 with a newline ("&#92;n").
   * Full deprecation can not be achieved before all sync profiles have been
   * updated with a M86+ client.
   * TODO(crbug/1111740): Remove usages of address_home_line1/2 and mark field
   * as deprecated.
   * </pre>
   *
   * <code>optional string address_home_line1 = 7;</code>
   * @return Whether the addressHomeLine1 field is set.
   */
  boolean hasAddressHomeLine1();
  /**
   * <pre>
   * Address field.
   * The address_home_line1/2 fields are deprecated and
   * address_home_street_address should be used instead by
   * joining address_home_line1/2 with a newline ("&#92;n").
   * Full deprecation can not be achieved before all sync profiles have been
   * updated with a M86+ client.
   * TODO(crbug/1111740): Remove usages of address_home_line1/2 and mark field
   * as deprecated.
   * </pre>
   *
   * <code>optional string address_home_line1 = 7;</code>
   * @return The addressHomeLine1.
   */
  java.lang.String getAddressHomeLine1();
  /**
   * <pre>
   * Address field.
   * The address_home_line1/2 fields are deprecated and
   * address_home_street_address should be used instead by
   * joining address_home_line1/2 with a newline ("&#92;n").
   * Full deprecation can not be achieved before all sync profiles have been
   * updated with a M86+ client.
   * TODO(crbug/1111740): Remove usages of address_home_line1/2 and mark field
   * as deprecated.
   * </pre>
   *
   * <code>optional string address_home_line1 = 7;</code>
   * @return The bytes for addressHomeLine1.
   */
  com.google.protobuf.ByteString
      getAddressHomeLine1Bytes();

  /**
   * <code>optional string address_home_line2 = 8;</code>
   * @return Whether the addressHomeLine2 field is set.
   */
  boolean hasAddressHomeLine2();
  /**
   * <code>optional string address_home_line2 = 8;</code>
   * @return The addressHomeLine2.
   */
  java.lang.String getAddressHomeLine2();
  /**
   * <code>optional string address_home_line2 = 8;</code>
   * @return The bytes for addressHomeLine2.
   */
  com.google.protobuf.ByteString
      getAddressHomeLine2Bytes();

  /**
   * <code>optional string address_home_city = 9;</code>
   * @return Whether the addressHomeCity field is set.
   */
  boolean hasAddressHomeCity();
  /**
   * <code>optional string address_home_city = 9;</code>
   * @return The addressHomeCity.
   */
  java.lang.String getAddressHomeCity();
  /**
   * <code>optional string address_home_city = 9;</code>
   * @return The bytes for addressHomeCity.
   */
  com.google.protobuf.ByteString
      getAddressHomeCityBytes();

  /**
   * <code>optional string address_home_state = 10;</code>
   * @return Whether the addressHomeState field is set.
   */
  boolean hasAddressHomeState();
  /**
   * <code>optional string address_home_state = 10;</code>
   * @return The addressHomeState.
   */
  java.lang.String getAddressHomeState();
  /**
   * <code>optional string address_home_state = 10;</code>
   * @return The bytes for addressHomeState.
   */
  com.google.protobuf.ByteString
      getAddressHomeStateBytes();

  /**
   * <code>optional string address_home_zip = 11;</code>
   * @return Whether the addressHomeZip field is set.
   */
  boolean hasAddressHomeZip();
  /**
   * <code>optional string address_home_zip = 11;</code>
   * @return The addressHomeZip.
   */
  java.lang.String getAddressHomeZip();
  /**
   * <code>optional string address_home_zip = 11;</code>
   * @return The bytes for addressHomeZip.
   */
  com.google.protobuf.ByteString
      getAddressHomeZipBytes();

  /**
   * <code>optional string address_home_country = 12;</code>
   * @return Whether the addressHomeCountry field is set.
   */
  boolean hasAddressHomeCountry();
  /**
   * <code>optional string address_home_country = 12;</code>
   * @return The addressHomeCountry.
   */
  java.lang.String getAddressHomeCountry();
  /**
   * <code>optional string address_home_country = 12;</code>
   * @return The bytes for addressHomeCountry.
   */
  com.google.protobuf.ByteString
      getAddressHomeCountryBytes();

  /**
   * <pre>
   * Additional address fields for i18n.
   * </pre>
   *
   * <code>optional string address_home_street_address = 17;</code>
   * @return Whether the addressHomeStreetAddress field is set.
   */
  boolean hasAddressHomeStreetAddress();
  /**
   * <pre>
   * Additional address fields for i18n.
   * </pre>
   *
   * <code>optional string address_home_street_address = 17;</code>
   * @return The addressHomeStreetAddress.
   */
  java.lang.String getAddressHomeStreetAddress();
  /**
   * <pre>
   * Additional address fields for i18n.
   * </pre>
   *
   * <code>optional string address_home_street_address = 17;</code>
   * @return The bytes for addressHomeStreetAddress.
   */
  com.google.protobuf.ByteString
      getAddressHomeStreetAddressBytes();

  /**
   * <code>optional string address_home_sorting_code = 18;</code>
   * @return Whether the addressHomeSortingCode field is set.
   */
  boolean hasAddressHomeSortingCode();
  /**
   * <code>optional string address_home_sorting_code = 18;</code>
   * @return The addressHomeSortingCode.
   */
  java.lang.String getAddressHomeSortingCode();
  /**
   * <code>optional string address_home_sorting_code = 18;</code>
   * @return The bytes for addressHomeSortingCode.
   */
  com.google.protobuf.ByteString
      getAddressHomeSortingCodeBytes();

  /**
   * <code>optional string address_home_dependent_locality = 19;</code>
   * @return Whether the addressHomeDependentLocality field is set.
   */
  boolean hasAddressHomeDependentLocality();
  /**
   * <code>optional string address_home_dependent_locality = 19;</code>
   * @return The addressHomeDependentLocality.
   */
  java.lang.String getAddressHomeDependentLocality();
  /**
   * <code>optional string address_home_dependent_locality = 19;</code>
   * @return The bytes for addressHomeDependentLocality.
   */
  com.google.protobuf.ByteString
      getAddressHomeDependentLocalityBytes();

  /**
   * <code>optional string address_home_language_code = 20;</code>
   * @return Whether the addressHomeLanguageCode field is set.
   */
  boolean hasAddressHomeLanguageCode();
  /**
   * <code>optional string address_home_language_code = 20;</code>
   * @return The addressHomeLanguageCode.
   */
  java.lang.String getAddressHomeLanguageCode();
  /**
   * <code>optional string address_home_language_code = 20;</code>
   * @return The bytes for addressHomeLanguageCode.
   */
  com.google.protobuf.ByteString
      getAddressHomeLanguageCodeBytes();

  /**
   * <code>optional string address_home_thoroughfare_name = 38;</code>
   * @return Whether the addressHomeThoroughfareName field is set.
   */
  boolean hasAddressHomeThoroughfareName();
  /**
   * <code>optional string address_home_thoroughfare_name = 38;</code>
   * @return The addressHomeThoroughfareName.
   */
  java.lang.String getAddressHomeThoroughfareName();
  /**
   * <code>optional string address_home_thoroughfare_name = 38;</code>
   * @return The bytes for addressHomeThoroughfareName.
   */
  com.google.protobuf.ByteString
      getAddressHomeThoroughfareNameBytes();

  /**
   * <code>optional string address_home_thoroughfare_number = 39;</code>
   * @return Whether the addressHomeThoroughfareNumber field is set.
   */
  boolean hasAddressHomeThoroughfareNumber();
  /**
   * <code>optional string address_home_thoroughfare_number = 39;</code>
   * @return The addressHomeThoroughfareNumber.
   */
  java.lang.String getAddressHomeThoroughfareNumber();
  /**
   * <code>optional string address_home_thoroughfare_number = 39;</code>
   * @return The bytes for addressHomeThoroughfareNumber.
   */
  com.google.protobuf.ByteString
      getAddressHomeThoroughfareNumberBytes();

  /**
   * <code>optional string address_home_dependent_thoroughfare_name = 40;</code>
   * @return Whether the addressHomeDependentThoroughfareName field is set.
   */
  boolean hasAddressHomeDependentThoroughfareName();
  /**
   * <code>optional string address_home_dependent_thoroughfare_name = 40;</code>
   * @return The addressHomeDependentThoroughfareName.
   */
  java.lang.String getAddressHomeDependentThoroughfareName();
  /**
   * <code>optional string address_home_dependent_thoroughfare_name = 40;</code>
   * @return The bytes for addressHomeDependentThoroughfareName.
   */
  com.google.protobuf.ByteString
      getAddressHomeDependentThoroughfareNameBytes();

  /**
   * <code>optional string address_home_premise_name = 41;</code>
   * @return Whether the addressHomePremiseName field is set.
   */
  boolean hasAddressHomePremiseName();
  /**
   * <code>optional string address_home_premise_name = 41;</code>
   * @return The addressHomePremiseName.
   */
  java.lang.String getAddressHomePremiseName();
  /**
   * <code>optional string address_home_premise_name = 41;</code>
   * @return The bytes for addressHomePremiseName.
   */
  com.google.protobuf.ByteString
      getAddressHomePremiseNameBytes();

  /**
   * <code>optional string address_home_subpremise_name = 42;</code>
   * @return Whether the addressHomeSubpremiseName field is set.
   */
  boolean hasAddressHomeSubpremiseName();
  /**
   * <code>optional string address_home_subpremise_name = 42;</code>
   * @return The addressHomeSubpremiseName.
   */
  java.lang.String getAddressHomeSubpremiseName();
  /**
   * <code>optional string address_home_subpremise_name = 42;</code>
   * @return The bytes for addressHomeSubpremiseName.
   */
  com.google.protobuf.ByteString
      getAddressHomeSubpremiseNameBytes();

  /**
   * <pre>
   * Validation status records for address fields.
   * </pre>
   *
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_city_status = 43;</code>
   * @return Whether the addressHomeCityStatus field is set.
   */
  boolean hasAddressHomeCityStatus();
  /**
   * <pre>
   * Validation status records for address fields.
   * </pre>
   *
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_city_status = 43;</code>
   * @return The addressHomeCityStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeCityStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_state_status = 44;</code>
   * @return Whether the addressHomeStateStatus field is set.
   */
  boolean hasAddressHomeStateStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_state_status = 44;</code>
   * @return The addressHomeStateStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeStateStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_zip_status = 45;</code>
   * @return Whether the addressHomeZipStatus field is set.
   */
  boolean hasAddressHomeZipStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_zip_status = 45;</code>
   * @return The addressHomeZipStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeZipStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_country_status = 46;</code>
   * @return Whether the addressHomeCountryStatus field is set.
   */
  boolean hasAddressHomeCountryStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_country_status = 46;</code>
   * @return The addressHomeCountryStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeCountryStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_street_address_status = 47;</code>
   * @return Whether the addressHomeStreetAddressStatus field is set.
   */
  boolean hasAddressHomeStreetAddressStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_street_address_status = 47;</code>
   * @return The addressHomeStreetAddressStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeStreetAddressStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_sorting_code_status = 48;</code>
   * @return Whether the addressHomeSortingCodeStatus field is set.
   */
  boolean hasAddressHomeSortingCodeStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_sorting_code_status = 48;</code>
   * @return The addressHomeSortingCodeStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeSortingCodeStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_dependent_locality_status = 49;</code>
   * @return Whether the addressHomeDependentLocalityStatus field is set.
   */
  boolean hasAddressHomeDependentLocalityStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_dependent_locality_status = 49;</code>
   * @return The addressHomeDependentLocalityStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeDependentLocalityStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_language_code_status = 50;</code>
   * @return Whether the addressHomeLanguageCodeStatus field is set.
   */
  boolean hasAddressHomeLanguageCodeStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_language_code_status = 50;</code>
   * @return The addressHomeLanguageCodeStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeLanguageCodeStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_thoroughfare_name_status = 51;</code>
   * @return Whether the addressHomeThoroughfareNameStatus field is set.
   */
  boolean hasAddressHomeThoroughfareNameStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_thoroughfare_name_status = 51;</code>
   * @return The addressHomeThoroughfareNameStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeThoroughfareNameStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_thoroughfare_number_status = 52;</code>
   * @return Whether the addressHomeThoroughfareNumberStatus field is set.
   */
  boolean hasAddressHomeThoroughfareNumberStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_thoroughfare_number_status = 52;</code>
   * @return The addressHomeThoroughfareNumberStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeThoroughfareNumberStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_dependent_thoroughfare_name_status = 53;</code>
   * @return Whether the addressHomeDependentThoroughfareNameStatus field is set.
   */
  boolean hasAddressHomeDependentThoroughfareNameStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_dependent_thoroughfare_name_status = 53;</code>
   * @return The addressHomeDependentThoroughfareNameStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeDependentThoroughfareNameStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_premise_name_status = 54;</code>
   * @return Whether the addressHomePremiseNameStatus field is set.
   */
  boolean hasAddressHomePremiseNameStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_premise_name_status = 54;</code>
   * @return The addressHomePremiseNameStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomePremiseNameStatus();

  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_subpremise_name_status = 55;</code>
   * @return Whether the addressHomeSubpremiseNameStatus field is set.
   */
  boolean hasAddressHomeSubpremiseNameStatus();
  /**
   * <code>optional .sync_pb.AutofillProfileSpecifics.VerificationStatus address_home_subpremise_name_status = 55;</code>
   * @return The addressHomeSubpremiseNameStatus.
   */
  org.chromium.components.sync.protocol.AutofillProfileSpecifics.VerificationStatus getAddressHomeSubpremiseNameStatus();

  /**
   * <pre>
   * Phone.
   * </pre>
   *
   * <code>repeated string phone_home_whole_number = 13;</code>
   * @return A list containing the phoneHomeWholeNumber.
   */
  java.util.List<java.lang.String>
      getPhoneHomeWholeNumberList();
  /**
   * <pre>
   * Phone.
   * </pre>
   *
   * <code>repeated string phone_home_whole_number = 13;</code>
   * @return The count of phoneHomeWholeNumber.
   */
  int getPhoneHomeWholeNumberCount();
  /**
   * <pre>
   * Phone.
   * </pre>
   *
   * <code>repeated string phone_home_whole_number = 13;</code>
   * @param index The index of the element to return.
   * @return The phoneHomeWholeNumber at the given index.
   */
  java.lang.String getPhoneHomeWholeNumber(int index);
  /**
   * <pre>
   * Phone.
   * </pre>
   *
   * <code>repeated string phone_home_whole_number = 13;</code>
   * @param index The index of the element to return.
   * @return The phoneHomeWholeNumber at the given index.
   */
  com.google.protobuf.ByteString
      getPhoneHomeWholeNumberBytes(int index);

  /**
   * <pre>
   * Validity bitfield.
   * Each set of two bits represents the validity state of a specific part of
   * the Autofill address. For more info please refer to autofill_profile.h.
   * </pre>
   *
   * <code>optional int64 validity_state_bitfield = 24;</code>
   * @return Whether the validityStateBitfield field is set.
   */
  boolean hasValidityStateBitfield();
  /**
   * <pre>
   * Validity bitfield.
   * Each set of two bits represents the validity state of a specific part of
   * the Autofill address. For more info please refer to autofill_profile.h.
   * </pre>
   *
   * <code>optional int64 validity_state_bitfield = 24;</code>
   * @return The validityStateBitfield.
   */
  long getValidityStateBitfield();

  /**
   * <pre>
   * Denotes whether the validity_state_bitfield is updated according to the
   * changes in the autofill profile values.
   * </pre>
   *
   * <code>optional bool is_client_validity_states_updated = 25;</code>
   * @return Whether the isClientValidityStatesUpdated field is set.
   */
  boolean hasIsClientValidityStatesUpdated();
  /**
   * <pre>
   * Denotes whether the validity_state_bitfield is updated according to the
   * changes in the autofill profile values.
   * </pre>
   *
   * <code>optional bool is_client_validity_states_updated = 25;</code>
   * @return The isClientValidityStatesUpdated.
   */
  boolean getIsClientValidityStatesUpdated();

  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>optional string label = 1 [deprecated = true];</code>
   * @return Whether the label field is set.
   */
  @java.lang.Deprecated boolean hasLabel();
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>optional string label = 1 [deprecated = true];</code>
   * @return The label.
   */
  @java.lang.Deprecated java.lang.String getLabel();
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>optional string label = 1 [deprecated = true];</code>
   * @return The bytes for label.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>optional string phone_fax_whole_number = 14 [deprecated = true];</code>
   * @return Whether the phoneFaxWholeNumber field is set.
   */
  @java.lang.Deprecated boolean hasPhoneFaxWholeNumber();
  /**
   * <code>optional string phone_fax_whole_number = 14 [deprecated = true];</code>
   * @return The phoneFaxWholeNumber.
   */
  @java.lang.Deprecated java.lang.String getPhoneFaxWholeNumber();
  /**
   * <code>optional string phone_fax_whole_number = 14 [deprecated = true];</code>
   * @return The bytes for phoneFaxWholeNumber.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getPhoneFaxWholeNumberBytes();
}
