function moviesList(input) {
  let movies = [];
  for (const line of input) {
    let command = line.split(' ');
    if(line.includes('addMovie')){

    let movieName = command.slice(1).join(' ');
    addMovie(movieName);
    
    
    } else if(line.includes('directedBy')){
    let idexOfCommand = command.indexOf('directedBy');
    let movieName = command.slice(0,idexOfCommand).join(' ');
    let director = command.slice(idexOfCommand + 1).join(' ');
    addDirector(movieName,director);
    }else{
        let idexOfCommand = command.indexOf('onDate');
        let movieName = command.slice(0,idexOfCommand).join(' ');
        let date = command.slice(idexOfCommand + 1).join(' ');
        addDate(movieName,date)
    }
    
  }
  for (const movie of movies) {
    if(movie.hasOwnProperty('name') && movie.hasOwnProperty('date') && movie.hasOwnProperty('director')){
        console.log(JSON.stringify(movie));
    }
    
}
  function addMovie(name) {
    movies.push({ name });
  }
  function addDirector(name, director) {
    let movie = movies.find((m) => m.name === name);
    if (movie) {
      movie.director = director;
      
    }
  }
  function addDate(name, date) {
    let movie = movies.find((m) => m.name === name);
    if (movie) {
      movie.date = date;
    }
  }
}
// moviesList([
//   "addMovie Fast and Furious",
//   "addMovie Godfather",
//   "Inception directedBy Christopher Nolan",
//   "Godfather directedBy Francis Ford Coppola",
//   "Godfather onDate 29.07.2018",
//   "Fast and Furious onDate 30.07.2018",
//   "Batman onDate 01.08.2018",
//   "Fast and Furious directedBy Rob Cohen",
// ]);
moviesList([
    'addMovie The Avengers',
    'addMovie Superman',
    'The Avengers directedBy Anthony Russo',
    'The Avengers onDate 30.07.2010',
    'Captain America onDate 30.07.2010',
    'Captain America directedBy Joe Russo'
    ]);
