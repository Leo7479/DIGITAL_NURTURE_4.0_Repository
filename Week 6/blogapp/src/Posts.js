import { Component } from "react";

export class Posts extends Component{

    constructor(props){
        super(props);
        this.state = {
            posts: [],
            error: null
        };
    }
    loadPosts(){
        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response=>response.json())
            .then(data=>this.setState({posts:data}))
            .catch(error=>this.setState({error}));
    }
    componentDidMount(){
        this.loadPosts();
    }
    componentDidCatch(error, info){
        this.setState({error:error.message});
        alert(`An error occurred: ${error.message}`);
    }
    render(){
        const {posts, error} = this.state;
        if(error){
            return <h1>{error}</h1>;
        }
        return(
            <div>
                {posts.map(post=>
                    <div key={post.id}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                    </div>
                )}
            </div>
        );
    }
}