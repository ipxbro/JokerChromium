// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ShowGenericUiProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ShowGenericUiProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The generic user interface to show.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
   * @return Whether the genericUserInterface field is set.
   */
  boolean hasGenericUserInterface();
  /**
   * <pre>
   * The generic user interface to show.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
   * @return The genericUserInterface.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto getGenericUserInterface();

  /**
   * <pre>
   * The set of model identifiers to write to the result. Note: this must be a
   * subset of the input model identifiers!
   * </pre>
   *
   * <code>repeated string output_model_identifiers = 2;</code>
   * @return A list containing the outputModelIdentifiers.
   */
  java.util.List<java.lang.String>
      getOutputModelIdentifiersList();
  /**
   * <pre>
   * The set of model identifiers to write to the result. Note: this must be a
   * subset of the input model identifiers!
   * </pre>
   *
   * <code>repeated string output_model_identifiers = 2;</code>
   * @return The count of outputModelIdentifiers.
   */
  int getOutputModelIdentifiersCount();
  /**
   * <pre>
   * The set of model identifiers to write to the result. Note: this must be a
   * subset of the input model identifiers!
   * </pre>
   *
   * <code>repeated string output_model_identifiers = 2;</code>
   * @param index The index of the element to return.
   * @return The outputModelIdentifiers at the given index.
   */
  java.lang.String getOutputModelIdentifiers(int index);
  /**
   * <pre>
   * The set of model identifiers to write to the result. Note: this must be a
   * subset of the input model identifiers!
   * </pre>
   *
   * <code>repeated string output_model_identifiers = 2;</code>
   * @param index The index of the element to return.
   * @return The outputModelIdentifiers at the given index.
   */
  com.google.protobuf.ByteString
      getOutputModelIdentifiersBytes(int index);

  /**
   * <pre>
   * If specified, available autofill credit cards will be provided and
   * auto-updated in the specified |model_identifier|.
   * </pre>
   *
   * <code>optional .autofill_assistant.ShowGenericUiProto.RequestAutofillCreditCards request_credit_cards = 3;</code>
   * @return Whether the requestCreditCards field is set.
   */
  boolean hasRequestCreditCards();
  /**
   * <pre>
   * If specified, available autofill credit cards will be provided and
   * auto-updated in the specified |model_identifier|.
   * </pre>
   *
   * <code>optional .autofill_assistant.ShowGenericUiProto.RequestAutofillCreditCards request_credit_cards = 3;</code>
   * @return The requestCreditCards.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiProto.RequestAutofillCreditCards getRequestCreditCards();

  /**
   * <pre>
   * If specified, available autofill profiles will be provided and auto-updated
   * in the specified |model_identifier|.
   * </pre>
   *
   * <code>optional .autofill_assistant.ShowGenericUiProto.RequestAutofillProfiles request_profiles = 4;</code>
   * @return Whether the requestProfiles field is set.
   */
  boolean hasRequestProfiles();
  /**
   * <pre>
   * If specified, available autofill profiles will be provided and auto-updated
   * in the specified |model_identifier|.
   * </pre>
   *
   * <code>optional .autofill_assistant.ShowGenericUiProto.RequestAutofillProfiles request_profiles = 4;</code>
   * @return The requestProfiles.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiProto.RequestAutofillProfiles getRequestProfiles();

  /**
   * <pre>
   * If specified, available login options (including those provided by password
   * manager) will be provided and auto-updated in the specified
   * |model_identifier|.
   * </pre>
   *
   * <code>optional .autofill_assistant.ShowGenericUiProto.RequestLoginOptions request_login_options = 5;</code>
   * @return Whether the requestLoginOptions field is set.
   */
  boolean hasRequestLoginOptions();
  /**
   * <pre>
   * If specified, available login options (including those provided by password
   * manager) will be provided and auto-updated in the specified
   * |model_identifier|.
   * </pre>
   *
   * <code>optional .autofill_assistant.ShowGenericUiProto.RequestLoginOptions request_login_options = 5;</code>
   * @return The requestLoginOptions.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiProto.RequestLoginOptions getRequestLoginOptions();

  /**
   * <code>optional .autofill_assistant.ShowGenericUiProto.PeriodicElementChecks periodic_element_checks = 6;</code>
   * @return Whether the periodicElementChecks field is set.
   */
  boolean hasPeriodicElementChecks();
  /**
   * <code>optional .autofill_assistant.ShowGenericUiProto.PeriodicElementChecks periodic_element_checks = 6;</code>
   * @return The periodicElementChecks.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiProto.PeriodicElementChecks getPeriodicElementChecks();

  /**
   * <pre>
   * When set to true, end this action on navigation events. The result will
   * have |navigation_ended| set to true.
   * </pre>
   *
   * <code>optional bool end_on_navigation = 7;</code>
   * @return Whether the endOnNavigation field is set.
   */
  boolean hasEndOnNavigation();
  /**
   * <pre>
   * When set to true, end this action on navigation events. The result will
   * have |navigation_ended| set to true.
   * </pre>
   *
   * <code>optional bool end_on_navigation = 7;</code>
   * @return The endOnNavigation.
   */
  boolean getEndOnNavigation();

  /**
   * <pre>
   * If true, run scripts flagged with |interrupt=true| as soon as their
   * preconditions match, then go back to the parent action.
   * </pre>
   *
   * <code>optional bool allow_interrupt = 8;</code>
   * @return Whether the allowInterrupt field is set.
   */
  boolean hasAllowInterrupt();
  /**
   * <pre>
   * If true, run scripts flagged with |interrupt=true| as soon as their
   * preconditions match, then go back to the parent action.
   * </pre>
   *
   * <code>optional bool allow_interrupt = 8;</code>
   * @return The allowInterrupt.
   */
  boolean getAllowInterrupt();

  /**
   * <pre>
   * If specified, will write the requested values from |UserData| to
   * |UserModel|. Will fail the action with PRECONDITION_FAILED if any of the
   * requested values is missing. Note that all values will have
   * |is_client_side_only| set to true.
   * </pre>
   *
   * <code>optional .autofill_assistant.ShowGenericUiProto.RequestUserData request_user_data = 9;</code>
   * @return Whether the requestUserData field is set.
   */
  boolean hasRequestUserData();
  /**
   * <pre>
   * If specified, will write the requested values from |UserData| to
   * |UserModel|. Will fail the action with PRECONDITION_FAILED if any of the
   * requested values is missing. Note that all values will have
   * |is_client_side_only| set to true.
   * </pre>
   *
   * <code>optional .autofill_assistant.ShowGenericUiProto.RequestUserData request_user_data = 9;</code>
   * @return The requestUserData.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiProto.RequestUserData getRequestUserData();
}
