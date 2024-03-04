function browserHistory(input, inputArr) {
  let browserNameToken = Object.entries(input)[0];
  let browserName = browserNameToken[1];
  let browserTapsToken = Object.entries(input)[1];
  let browserTaps = [...browserTapsToken[1]];
  let browserLogsToken = Object.entries(input)[3];
  let browserLogs = [...browserLogsToken[1]];
  let browserRecentlyClosedToken = Object.entries(input)[2];
  let browserRecentlyClosed = [...browserRecentlyClosedToken[1]];
  let actions = [...inputArr];
  for (let iterator of actions) {
    if (iterator === "Clear History and Cache") {
      browserTaps = [];
      browserRecentlyClosed = [];
      browserLogs = [];
    }
    let oneIter = iterator.split(" ")[0];
    let twoIter = iterator.split(" ")[1];
    if (oneIter === "Open") {
      browserTaps.push(twoIter);
      browserLogs.push(iterator);
    } else if (oneIter === "Close") {
      if (browserTaps.includes(twoIter)) {
        let index = browserTaps.indexOf(twoIter);
        browserTaps.splice(index, 1);
        browserLogs.push(iterator);
        browserRecentlyClosed.push(twoIter);
      }
    }
  }
  console.log(browserName);
  console.log(`Open Tabs: ${browserTaps.join(", ")}`);
  console.log(`Recently Closed: ${browserRecentlyClosed.join(", ")}`);
  console.log(`Browser Logs: ${browserLogs.join(", ")}`);
}

browserHistory(
    {"Browser Name":"Mozilla Firefox",
    "Open Tabs":["YouTube"],
    "Recently Closed":["Gmail", "Dropbox"],
    "Browser Logs":["Open Gmail", "Close Gmail", "Open Dropbox", "Open YouTube", "Close Dropbox"]},
    ["Open Wikipedia", "Clear History and Cache", "Open Twitter"]

);
