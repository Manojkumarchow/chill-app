import axios from "axios";

const USER_API = "http://localhost:8080";
const USER_API_URL = `${USER_API}/getAllUsers`;

class UserDataService {
  retrieveAllCourses() {
    return axios.get(`${USER_API_URL}`);
  }
}

export default new UserDataService();
