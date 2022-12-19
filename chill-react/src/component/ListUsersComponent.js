import React, { Component } from "react";
import UserDataService from "./UserDataService";
class ListUsersComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      users: [],
      message: null,
    };
    this.refreshUsers = this.refreshUsers.bind(this);
  }

  componentDidMount() {
    this.refreshUsers();
  }

  refreshUsers() {
    UserDataService.retrieveAllUsers() //HARDCODED
      .then((response) => {
        console.log(response);
        this.setState({ users: response.data });
      });
  }
  render() {
    return (
      <div className="container">
        <h3>All Users</h3>
        <div className="container">
          <table className="table">
            <thead>
              <tr>
                <th>Id</th>
                <th>Description</th>
              </tr>
            </thead>
            <tbody>
              {this.state.users.map((user) => (
                <tr key={user.id}>
                  <td>{user.id}</td>
                  <td>{user.description}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}

export default ListUsersComponent;
