package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.AddressRequest;
import com.amdexa.misc.arm.model.AddressResponse;
import com.amdexa.misc.arm.model.Cloudapierror;
import com.amdexa.misc.arm.model.DeleteAddressRequest;
import com.amdexa.misc.arm.model.DeleteEmailRequest;
import com.amdexa.misc.arm.model.DeletePhoneRequest;
import com.amdexa.misc.arm.model.FinancialProfileRequest;
import com.amdexa.misc.arm.model.FinancialProfileResponse;
import com.amdexa.misc.arm.model.GeneralSuccessResp;
import com.amdexa.misc.arm.model.MaritalStatusRequest;
import com.amdexa.misc.arm.model.MaritalStatusResponse;
import com.amdexa.misc.arm.model.PoeRequest;
import com.amdexa.misc.arm.model.PoeResponse;
import com.amdexa.misc.arm.model.SpouseRequest;
import com.amdexa.misc.arm.model.SpouseResponse;
import com.amdexa.misc.arm.model.UpdateAddressRequest;
import com.amdexa.misc.arm.model.UpdateEmailRequest;
import com.amdexa.misc.arm.model.UpdateFinancialProfileRequest;
import com.amdexa.misc.arm.model.UpdateMaritalStatusRequest;
import com.amdexa.misc.arm.model.UpdatePhoneRequest;
import com.amdexa.misc.arm.model.UpdatePoeRequest;
import com.amdexa.misc.arm.model.UpdateSpouseRequest;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Api(value = "demographic", description = "the demographic API")
public interface DemographicApi {

    @ApiOperation(value = "", nickname = "demographicAddressConsumerIdDelete", notes = "Used to delete the address for a consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/address/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<GeneralSuccessResp> demographicAddressConsumerIdDelete(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The delete address endpoint request body is a JSON Object following the delete address schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody DeleteAddressRequest deleteAddressRequest);


    @ApiOperation(value = "", nickname = "demographicAddressConsumerIdGet", notes = "Used to retrieve the address for a consumer", response = AddressResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = AddressResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/address/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AddressResponse> demographicAddressConsumerIdGet(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The get address endpoint request body is a JSON Object following the addressRequest schema.  The object has the following properties" ,required=true )  @Valid @RequestBody AddressRequest addressRequest);


    @ApiOperation(value = "", nickname = "demographicAddressConsumerIdPut", notes = "Used to update the address for a consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/address/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> demographicAddressConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The update address request body is a JSON Object following the below properties.  Blank values will be treated as no change." ,required=true )  @Valid @RequestBody UpdateAddressRequest updateAddressRequest);


    @ApiOperation(value = "", nickname = "demographicEmailaddressConsumerIdDelete", notes = "Used to delete the email address for a consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/emailaddress/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<GeneralSuccessResp> demographicEmailaddressConsumerIdDelete(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The delete email address endpoint request body is a JSON Object following the delete email address schema." ,required=true )  @Valid @RequestBody DeleteEmailRequest deleteEmailRequest);


    @ApiOperation(value = "", nickname = "demographicEmailaddressConsumerIdPut", notes = "Used to update the email address for a consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/emailaddress/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> demographicEmailaddressConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Update Email Address endpoint request body is a JSON Object following the updateEmailRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdateEmailRequest updateEmailRequest);


    @ApiOperation(value = "", nickname = "demographicFinancialprofileConsumerIdGet", notes = "Used to get the financial profile the consumer", response = FinancialProfileResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = FinancialProfileResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/financialprofile/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<FinancialProfileResponse> demographicFinancialprofileConsumerIdGet(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The get financial profile endpoint request body is a JSON Object following the financialProfileRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody FinancialProfileRequest financialProfileRequest);


    @ApiOperation(value = "", nickname = "demographicFinancialprofileConsumerIdPut", notes = "Used to update the financial profile the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/financialprofile/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> demographicFinancialprofileConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Update financial profile endpoint request body is a JSON Object following the updateFinancialProfileRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdateFinancialProfileRequest updateFinancialProfileRequest);


    @ApiOperation(value = "", nickname = "demographicMaritalstatusConsumerIdGet", notes = "Used to get the marital status for the consumer", response = MaritalStatusResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = MaritalStatusResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/maritalstatus/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<MaritalStatusResponse> demographicMaritalstatusConsumerIdGet(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The get marital status endpoint request body is a JSON Object following the maritalStatusRequest schema.  The object has the following properties" ,required=true )  @Valid @RequestBody MaritalStatusRequest maritalStatusRequest);


    @ApiOperation(value = "", nickname = "demographicMaritalstatusConsumerIdPut", notes = "Used to update the marital status for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/maritalstatus/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> demographicMaritalstatusConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The update marital status endpoint request body is a JSON Object following the updateMaritalStatusRequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdateMaritalStatusRequest updateMaritalStatusRequest);


    @ApiOperation(value = "", nickname = "demographicPhoneConsumerIdPhoneNumberDelete", notes = "Used to delete the phone number for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/phone/{consumerId}/{phoneNumber}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<GeneralSuccessResp> demographicPhoneConsumerIdPhoneNumberDelete(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The 10 digit Phone Number to remove",required=true) @PathVariable("phoneNumber") String phoneNumber,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The delete phone endpoint request body is a JSON Object following the delete phone schema.  The object has the following properties." ,required=true )  @Valid @RequestBody DeletePhoneRequest deletePhoneRequest);


    @ApiOperation(value = "", nickname = "demographicPhoneConsumerIdPhoneNumberPut", notes = "Used to update the phone number for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/phone/{consumerId}/{phoneNumber}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> demographicPhoneConsumerIdPhoneNumberPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "Ten digit phone number.",required=true) @PathVariable("phoneNumber") String phoneNumber,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The update phone request body is a JSON Object following the below properties." ,required=true )  @Valid @RequestBody UpdatePhoneRequest updatePhoneRequest);


    @ApiOperation(value = "", nickname = "demographicPoeConsumerIdGet", notes = "Used to get the place of employment for the consumer", response = PoeResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = PoeResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/poe/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<PoeResponse> demographicPoeConsumerIdGet(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The get POE endpoint request body is a JSON Object following the POE schema.  The object has the following properties" ,required=true )  @Valid @RequestBody PoeRequest poeRequest);


    @ApiOperation(value = "", nickname = "demographicPoeConsumerIdPut", notes = "Used to update the place of employment for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/poe/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> demographicPoeConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Update POE endpoint request body is a JSON Object following the updatePOERequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdatePoeRequest updatePoeRequest);


    @ApiOperation(value = "", nickname = "demographicSpouseConsumerIdGet", notes = "Used to get the spouse information for the consumer", response = SpouseResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = SpouseResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/spouse/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<SpouseResponse> demographicSpouseConsumerIdGet(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The get spouse endpoint request body is a JSON Object following the spouseRequest schema.  The object has the following properties" ,required=true )  @Valid @RequestBody SpouseRequest spouseRequest);


    @ApiOperation(value = "", nickname = "demographicSpouseConsumerIdPut", notes = "Used to update the spouse information for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/demographic/spouse/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> demographicSpouseConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Update Spouse endpoint request body is a JSON Object following the updateSpouseRequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdateSpouseRequest updateSpouseRequest);

}
