function attachEvents() {
    const BASE_URL = 'http://localhost:3030/jsonstore/forecaster/locations/';
    const TODAY_URL = 'http://localhost:3030/jsonstore/forecaster/today/';
    const UPCOMING_URL = 'http://localhost:3030/jsonstore/forecaster/upcoming/';
    const location = document.getElementById('location');
    const forecastDiv = document.getElementById('forecast');
    const currentForecastDiv = document.getElementById('current');
    const upcomingForecastDiv = document.getElementById('upcoming');
    const getWeatherBtn = document.getElementById('submit');
    getWeatherBtn.addEventListener('click',showWeather);
    const weatherSymbol = {
        'Sunny': '☀',
        'Partly sunny': '⛅',
        'Overcast': '☁',
        'Rain': '☂',
    }
    
    function showWeather(){
        fetch(`${BASE_URL}`)
        .then((res) => res.json())
        .then((data) =>{
            let needLocation = data.find((loc) => loc.name === location.value);
            forecastDiv.style.display = 'block';
            fetch(TODAY_URL + needLocation.code)
            .then((res) => res.json())
            .then((data) => {
                const divClassForecasts = createElement('div','',currentForecastDiv,'','forecasts');
                const spanWeatherIcon = createElement('span',weatherSymbol[data.forecast.condition],divClassForecasts,'','condition');
                spanWeatherIcon.classList.add('symbol');
                const spanClassCondition = createElement('span', '', divClassForecasts, '', 'condition');
                   createElement('span', data.name, spanClassCondition, '', 'forecast-data');
                   let degrees = `${data.forecast.low}°/${data.forecast.high}°`;
                   createElement('span', degrees, spanClassCondition, '', 'forecast-data');
                   createElement('span', data.forecast.condition, spanClassCondition, '', 'forecast-data');
            })
            fetch(UPCOMING_URL + needLocation.code)
            .then((res) => res.json())
            .then((data) => {
                const divClassForecastsInfo = createElement('div','',upcomingForecastDiv,'','forecast-info');
                for (const dayForecast of data.forecast) {
                    const spanWithClassUpcoming = createElement('span', '', divClassForecastsInfo, '',
                    'upcoming');
                    createElement('span', weatherSymbol[dayForecast.condition], spanWithClassUpcoming, '', 'symbol');
                    let degrees = `${dayForecast.low}°/${dayForecast.high}°`;
                    createElement('span', degrees, spanWithClassUpcoming, '', 'forecast-data');
                    createElement('span', dayForecast.condition, spanWithClassUpcoming, '', 'forecast-data');
                }
            })
        })
        .catch((err) =>{
            forecastDiv.style.display = 'block';
            forecastDiv.textContent = 'Error';
        })
    }





    function createElement(type, content, parentNode, id, classes, attributes){
		const htmlElement = document.createElement(type);
	
		if (content && type === 'input') {
		  htmlElement.value = content;
		}
		if (content && type !== 'input') {
		  htmlElement.textContent = content;
		}
	
		if (id) {
		  htmlElement.id = id;
		}
		if (classes) {
		  htmlElement.classList.add(classes)
		}
		if (attributes) {
		  for (const key in attributes) {
			htmlElement.setAttribute(key, attributes[key])
		  }
		}
		if (parentNode) {
		  parentNode.appendChild(htmlElement);
		}
		return htmlElement;
	  }

    }
attachEvents();