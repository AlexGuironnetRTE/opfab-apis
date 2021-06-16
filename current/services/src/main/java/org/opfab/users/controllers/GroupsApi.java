/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.20).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.opfab.users.controllers;

import org.opfab.users.model.Group;
import java.util.List;
import org.opfab.users.model.Perimeter;
import com.fasterxml.jackson.databind.ObjectMapper;
//import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
//import org.springframework.security.access.prepost.PreAuthorize;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * the groups API
 *
 * @author SWAGGER
 **/

//@Api(value = "groups", description = "the groups API")
@RequestMapping("/groups")
public interface GroupsApi {

    /**
     * <p>Add perimeters to group</p>
     * <p>ONLY add perimeters to group (no deletion).</p>
     * @param id Group id
     * @param perimeters Array of perimeter id to be added to group
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Add perimeters to group", nickname = "addGroupPerimeters", notes = "ONLY add perimeters to group (no deletion).", tags={ "groups","perimeters", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary"),
        @ApiResponse(code = 404, message = "Required group not found") })
    */
    ///{id}/perimeters
    @RequestMapping(value = "/{id}/perimeters",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    //
    default Void _addGroupPerimeters(HttpServletRequest request, HttpServletResponse response,/*@ApiParam(value = "Group id",required=true)*/ @PathVariable("id") String id,/*@ApiParam(value = "Array of perimeter id to be added to group"  )*/  @Valid @RequestBody List<String> perimeters)  throws Exception {
        return addGroupPerimeters(request, response ,id,perimeters);
    }

    // Override this method
    /**
    * <p>Add perimeters to group</p>
    * <p>ONLY add perimeters to group (no deletion).</p>
    * @param id Group id
* @param perimeters Array of perimeter id to be added to group
    * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    Void addGroupPerimeters(HttpServletRequest request, HttpServletResponse response,String id,List<String> perimeters) throws Exception;


    /**
     * <p>Add users to group</p>
     * <p>ONLY add users to group (no deletion)</p>
     * @param id Group id
     * @param users Array of user ids to be added to group
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Add users to group", nickname = "addGroupUsers", notes = "ONLY add users to group (no deletion)", tags={ "groups","users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary"),
        @ApiResponse(code = 404, message = "Required group not found") })
    */
    ///{id}/users
    @RequestMapping(value = "/{id}/users",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    //
    default Void _addGroupUsers(HttpServletRequest request, HttpServletResponse response,/*@ApiParam(value = "Group id",required=true)*/ @PathVariable("id") String id,/*@ApiParam(value = "Array of user ids to be added to group"  )*/  @Valid @RequestBody List<String> users)  throws Exception {
        return addGroupUsers(request, response ,id,users);
    }

    // Override this method
    /**
    * <p>Add users to group</p>
    * <p>ONLY add users to group (no deletion)</p>
    * @param id Group id
* @param users Array of user ids to be added to group
    * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    Void addGroupUsers(HttpServletRequest request, HttpServletResponse response,String id,List<String> users) throws Exception;


    /**
     * <p>Create a new group of users</p>
     * <p>Create a new group of users</p>
     * @param group Group to be created
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Create a new group of users", nickname = "createGroup", notes = "Create a new group of users", response = Group.class, tags={ "groups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = Group.class),
        @ApiResponse(code = 201, message = "Created", response = Group.class),
        @ApiResponse(code = 400, message = "Bad request (duplicate key)"),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary") })
    */
    //
    @RequestMapping(
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    //
    default Group _createGroup(HttpServletRequest request, HttpServletResponse response,/*@ApiParam(value = "Group to be created"  )*/  @Valid @RequestBody Group group)  throws Exception {
        return createGroup(request, response ,group);
    }

    // Override this method
    /**
    * <p>Create a new group of users</p>
    * <p>Create a new group of users</p>
    * @param group Group to be created
    * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    Group createGroup(HttpServletRequest request, HttpServletResponse response,Group group) throws Exception;


    /**
     * <p>Remove group</p>
     * <p>Remove a group</p>
     * @param id Group id
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Remove group", nickname = "deleteGroup", notes = "Remove a group", tags={ "groups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deleted"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary"),
        @ApiResponse(code = 404, message = "Required group not found") })
    */
    ///{id}
    @RequestMapping(value = "/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    //
    default Void _deleteGroup(HttpServletRequest request, HttpServletResponse response,/*@ApiParam(value = "Group id",required=true)*/ @PathVariable("id") String id)  throws Exception {
        return deleteGroup(request, response ,id);
    }

    // Override this method
    /**
    * <p>Remove group</p>
    * <p>Remove a group</p>
    * @param id Group id
    * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    Void deleteGroup(HttpServletRequest request, HttpServletResponse response,String id) throws Exception;


    /**
     * <p>Remove user from group</p>
     * <p>ONLY remove user from group (no addition)</p>
     * @param id Group id
     * @param login User login
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Remove user from group", nickname = "deleteGroupUser", notes = "ONLY remove user from group (no addition)", tags={ "groups","users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deleted"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary"),
        @ApiResponse(code = 404, message = "Required group not found") })
    */
    ///{id}/users/{login}
    @RequestMapping(value = "/{id}/users/{login}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    //
    default Void _deleteGroupUser(HttpServletRequest request, HttpServletResponse response,/*@ApiParam(value = "Group id",required=true)*/ @PathVariable("id") String id,/*@ApiParam(value = "User login",required=true)*/ @PathVariable("login") String login)  throws Exception {
        return deleteGroupUser(request, response ,id,login);
    }

    // Override this method
    /**
    * <p>Remove user from group</p>
    * <p>ONLY remove user from group (no addition)</p>
    * @param id Group id
* @param login User login
    * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    Void deleteGroupUser(HttpServletRequest request, HttpServletResponse response,String id,String login) throws Exception;


    /**
     * <p>Remove all users from group</p>
     * <p>remove all users from group</p>
     * @param id Group id
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Remove all users from group", nickname = "deleteGroupUsers", notes = "remove all users from group", tags={ "groups","users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deleted"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary"),
        @ApiResponse(code = 404, message = "Required group not found") })
    */
    ///{id}/users
    @RequestMapping(value = "/{id}/users",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    //
    default Void _deleteGroupUsers(HttpServletRequest request, HttpServletResponse response,/*@ApiParam(value = "Group id",required=true)*/ @PathVariable("id") String id)  throws Exception {
        return deleteGroupUsers(request, response ,id);
    }

    // Override this method
    /**
    * <p>Remove all users from group</p>
    * <p>remove all users from group</p>
    * @param id Group id
    * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    Void deleteGroupUsers(HttpServletRequest request, HttpServletResponse response,String id) throws Exception;


    /**
     * <p>Fetch an existing group of users</p>
     * <p>Fetch an existing group of users</p>
     * @param id Group id
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Fetch an existing group of users", nickname = "fetchGroup", notes = "Fetch an existing group of users", response = Group.class, tags={ "groups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Group.class),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary"),
        @ApiResponse(code = 404, message = "Required group not found") })
    */
    ///{id}
    @RequestMapping(value = "/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    //
    default Group _fetchGroup(HttpServletRequest request, HttpServletResponse response,/*@ApiParam(value = "Group id",required=true)*/ @PathVariable("id") String id)  throws Exception {
        return fetchGroup(request, response ,id);
    }

    // Override this method
    /**
    * <p>Fetch an existing group of users</p>
    * <p>Fetch an existing group of users</p>
    * @param id Group id
    * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    Group fetchGroup(HttpServletRequest request, HttpServletResponse response,String id) throws Exception;


    /**
     * <p>Fetch an existing group's perimeters</p>
     * <p>Fetch existing group's perimeters from their id.</p>
     * @param id group id
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Fetch an existing group's perimeters", nickname = "fetchGroupPerimeters", notes = "Fetch existing group's perimeters from their id.", response = Perimeter.class, responseContainer = "List", tags={ "groups","perimeters", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Perimeter.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary"),
        @ApiResponse(code = 404, message = "Required group not found") })
    */
    ///{id}/perimeters
    @RequestMapping(value = "/{id}/perimeters",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    //
    default List<Perimeter> _fetchGroupPerimeters(HttpServletRequest request, HttpServletResponse response,/*@ApiParam(value = "group id",required=true)*/ @PathVariable("id") String id)  throws Exception {
        return fetchGroupPerimeters(request, response ,id);
    }

    // Override this method
    /**
    * <p>Fetch an existing group's perimeters</p>
    * <p>Fetch existing group's perimeters from their id.</p>
    * @param id group id
    * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    List<Perimeter> fetchGroupPerimeters(HttpServletRequest request, HttpServletResponse response,String id) throws Exception;


    /**
     * <p>Fetch a list of all existing groups</p>
     * <p>Fetch a list of all existing groups, with pagination and filter options</p>
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Fetch a list of all existing groups", nickname = "fetchGroups", notes = "Fetch a list of all existing groups, with pagination and filter options", response = Group.class, responseContainer = "List", tags={ "groups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Group.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary") })
    */
    //
    @RequestMapping(
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    //
    default List<Group> _fetchGroups(HttpServletRequest request, HttpServletResponse response)  throws Exception {
        return fetchGroups(request, response );
    }

    // Override this method
    /**
    * <p>Fetch a list of all existing groups</p>
    * <p>Fetch a list of all existing groups, with pagination and filter options</p>
        * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    List<Group> fetchGroups(HttpServletRequest request, HttpServletResponse response) throws Exception;


    /**
     * <p>Update existing group</p>
     * <p>Update existing group</p>
     * @param id Id of group to be updated (should match \&quot;id group\&quot; in request body)
     * @param group Updated group data (should match \&quot;id group\&quot; path parameter)
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Update existing group", nickname = "updateGroup", notes = "Update existing group", response = Group.class, tags={ "groups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = Group.class),
        @ApiResponse(code = 201, message = "Created", response = Group.class),
        @ApiResponse(code = 400, message = "Bad request (body doesn't match \"id group\" path parameter)"),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary") })
    */
    ///{id}
    @RequestMapping(value = "/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    //
    default Group _updateGroup(HttpServletRequest request, HttpServletResponse response,/*@ApiParam(value = "Id of group to be updated (should match \"id group\" in request body)",required=true)*/ @PathVariable("id") String id,/*@ApiParam(value = "Updated group data (should match \"id group\" path parameter)"  )*/  @Valid @RequestBody Group group)  throws Exception {
        return updateGroup(request, response ,id,group);
    }

    // Override this method
    /**
    * <p>Update existing group</p>
    * <p>Update existing group</p>
    * @param id Id of group to be updated (should match \&quot;id group\&quot; in request body)
* @param group Updated group data (should match \&quot;id group\&quot; path parameter)
    * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    Group updateGroup(HttpServletRequest request, HttpServletResponse response,String id,Group group) throws Exception;


    /**
     * <p>Update list of perimeters for group</p>
     * <p>Update list of perimeters for group, perimeters not included in given list are no longer linked to the group.</p>
     * @param id Group id
     * @param perimeters Array of perimeter id representing exactly the intended list of perimeters that must be linked to the group after update
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Update list of perimeters for group", nickname = "updateGroupPerimeters", notes = "Update list of perimeters for group, perimeters not included in given list are no longer linked to the group.", tags={ "groups","perimeters", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary"),
        @ApiResponse(code = 404, message = "Required group not found") })
    */
    ///{id}/perimeters
    @RequestMapping(value = "/{id}/perimeters",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    //
    default Void _updateGroupPerimeters(HttpServletRequest request, HttpServletResponse response,/*@ApiParam(value = "Group id",required=true)*/ @PathVariable("id") String id,/*@ApiParam(value = "Array of perimeter id representing exactly the intended list of perimeters that must be linked to the group after update"  )*/  @Valid @RequestBody List<String> perimeters)  throws Exception {
        return updateGroupPerimeters(request, response ,id,perimeters);
    }

    // Override this method
    /**
    * <p>Update list of perimeters for group</p>
    * <p>Update list of perimeters for group, perimeters not included in given list are no longer linked to the group.</p>
    * @param id Group id
* @param perimeters Array of perimeter id representing exactly the intended list of perimeters that must be linked to the group after update
    * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    Void updateGroupPerimeters(HttpServletRequest request, HttpServletResponse response,String id,List<String> perimeters) throws Exception;


    /**
     * <p>Update list of group users</p>
     * <p>Update list of group users, users not included in given list are removed from group</p>
     * @param id Group id
     * @param users Array of user ids representing exactly the intended list of group users after update
     * @return !AUTOGENERATED!
     * @throws Exception !AUTOGENERATED!
     **/
 /*   @ApiOperation(value = "Update list of group users", nickname = "updateGroupUsers", notes = "Update list of group users, users not included in given list are removed from group", tags={ "groups","users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Authentication required"),
        @ApiResponse(code = 403, message = "Forbidden - ADMIN role necessary"),
        @ApiResponse(code = 404, message = "Required group not found") })
    */
    ///{id}/users
    @RequestMapping(value = "/{id}/users",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    //
    default Void _updateGroupUsers(HttpServletRequest request, HttpServletResponse response,/*@ApiParam(value = "Group id",required=true)*/ @PathVariable("id") String id,/*@ApiParam(value = "Array of user ids representing exactly the intended list of group users after update"  )*/  @Valid @RequestBody List<String> users)  throws Exception {
        return updateGroupUsers(request, response ,id,users);
    }

    // Override this method
    /**
    * <p>Update list of group users</p>
    * <p>Update list of group users, users not included in given list are removed from group</p>
    * @param id Group id
* @param users Array of user ids representing exactly the intended list of group users after update
    * @return !AUTOGENERATED!
    * @throws Exception !AUTOGENERATED!
    **/
    Void updateGroupUsers(HttpServletRequest request, HttpServletResponse response,String id,List<String> users) throws Exception;

}
