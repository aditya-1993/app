import { render } from '@testing-library/react';
import React from 'react';
import styles from './UserView.module.css';
const axios = require('axios');

class UserView extends React.Component {
  constructor(props){
    super(props);
    this.state = {

    }
  }

  fetchUsers(){
    axios.get("http://localhost:8080/demo/firstapi/",{
            headers: {
                "content-type": "application/json"
              }
        }).then(res=>{
            console.log(res);
            this.setState({email:res.data.results[0].email});
            this.setState({profileImage:res.data.results[0].profileImage})
        })
        .catch(err=>console.log(err))
  }

  componentDidMount(){
    this.fetchUsers();
    console.log("mounted");
  }

  render(){
    return (<div><h1>Hello World</h1></div>);
  }
}

export default UserView;
