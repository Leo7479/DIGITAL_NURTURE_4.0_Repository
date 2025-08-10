import logo from './logo.svg';
import './App.css';
import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';
import CourseDetails from './Components/CourseDetails';

function App() {
  const showCourses = true;

  const books = [
    { name: 'Master React', price: 670 },
    { name: 'Deep Dive into Angular 11', price: 800 },
    { name: 'Mongo Essentials', price: 450 }
  ];

  const blogs = [
    { title: 'React Learning', author: 'Stephen Biz', content: 'Welcome to learning React!' },
    { title: 'Installation', author: 'Schwezdenier', content: 'You can install React from npm.' }
  ];

  return (
    <div className="App" style={{ display: 'flex', justifyContent: 'space-around' }}>
      {/* Logical AND */}
      {showCourses && <CourseDetails show={showCourses} />}

      <BookDetails books={books} />

      <BlogDetails blogs={blogs} />
    </div>
  );
}

export default App;
