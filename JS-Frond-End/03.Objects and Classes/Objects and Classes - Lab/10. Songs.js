function songsList(input) {

    class Song {
        constructor(typeList, name, time) {
            this.typeList = typeList,
                this.name = name,
                this.time = time
        }
    }

    let numberOfSongs = input.shift();
    let typeOfSongs = input.pop();

    let songs = [];
    for (let i = 0;i < numberOfSongs; i++) {
        let [typeList, name, time] = input[i].split('_');
        songs.push(new Song(typeList, name, time));
    }
    
    if (typeOfSongs === 'all') {
        songs.forEach((x) => console.log(x.name))
    }
    else {
        let filtered = songs.filter((x) => x.typeList === typeOfSongs);
        filtered.forEach((x) => console.log(x.name));
    }
}

songsList(
    [4,
        'favourite_DownTown_3:14',
        'listenLater_Andalouse_3:24',
        'favourite_In To The Night_3:58',
        'favourite_Live It Up_3:48',
        'listenLater']
    );
