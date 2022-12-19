import React, { Component } from "react";
import ListUsersComponent from "./ListUsersComponent";

class UserComponent extends Component {
  render() {
    return (
      <>
        <h1>User Application</h1>
        <ListUsersComponent />
      </>
    );
  }
}

export default UserComponent;
