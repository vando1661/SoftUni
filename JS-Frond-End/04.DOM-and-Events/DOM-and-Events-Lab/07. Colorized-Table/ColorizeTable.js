function colorize() {
    let tBody = Array.from(document.querySelectorAll("tr:nth-child(even)"));
    for (const e of tBody) {
        e.style.backgroundColor = 'Teal'
    }
    
}