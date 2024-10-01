class LeafletMap {
    constructor(containerId, center, zoom) {
        this.map = L.map(containerId).setView(center, zoom);
        this.initTileLayer();
        
        // Separate counters for each location
        this.attendanceCountSC = 0;
        this.attendanceCountBA = 0;
        this.attendanceCountLab = 0;

        this.loggedData = []; // Array to store logged data

        // Button setup
        this.btn = document.getElementById('btn');
        this.btn1 = document.getElementById('btn1');
        this.btn2 = document.getElementById('btn2');
        this.btnclear = document.getElementById('btnclear');
        this.logCountElement = document.getElementById('logCount');
        this.logCount1Element = document.getElementById('logCount1');
        this.logCount2Element = document.getElementById('logCount2');
        this.idContainer = document.getElementById('logContainer');

        // Attach event listeners to buttons
        this.btn.addEventListener('click', () => this.dataSc());
        this.btn1.addEventListener('click', () => this.dataLab());
        this.btn2.addEventListener('click', () => this.dataBa());
        this.btnclear.addEventListener('click', () => this.clearLogs());
    }

    initTileLayer() {
        L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
            maxZoom: 19,
            attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors | Sample for new corales BSIT student'
        }).addTo(this.map);
    }

    addMarker(lat, long, message) {
        const marker = L.marker([lat, long]).addTo(this.map)
            .bindPopup(message).openTooltip();
        this.loggedData.push(message); // Log the message
    }

    loadMarkersFromJson(url) {
        fetch(url)
            .then(response => response.json())
            .then(data => {
                data.forEach(marker => {
                    this.addMarker(marker.latitude, marker.longitude, marker.message);
                });
            })
            .catch(error => console.error("Error Loading servers:", error));
    }
    clearLogs(){
        this.attendanceCountSC = 0;
        this.attendanceCountBA = 0;
        this.attendanceCountLab = 0;
        
        // Clear logged data
        this.loggedData = [];
        
        // Update the display
        this.updateLogDisplay();
    }
    displayLogCount() {      
        this.logCountElement.innerHTML = `SC Building Attendance: ${this.attendanceCountSC}`;
        this.logCount1Element.innerHTML = `BA Building Attendance: ${this.attendanceCountBA}`;
        this.logCount2Element.innerHTML = `CCS Laboratory Attendance: ${this.attendanceCountLab}`;
   }

    dataSc() {
        this.addMarker(8.360238, 124.867470, 'SC building');
        this.attendanceCountSC++; // Increment attendance for SC building
        this.updateLogDisplay();
    }

    dataBa() {
        this.addMarker(8.359134, 124.868537, 'BA building');
        this.attendanceCountBA++; // Increment attendance for BA building
        this.updateLogDisplay();
    }

    dataLab() {
        this.addMarker(8.359639, 124.869179, 'CCS Laboratory 1');
        this.attendanceCountLab++; // Increment attendance for Lab
        this.updateLogDisplay();
    }

    updateLogDisplay() {
        this.idContainer.innerHTML = ''; // Clear previous logs
        this.loggedData.forEach(data => {
            const logItem = document.createElement('div');
            logItem.className = 'log-item';
          //logItem.innerText = data; // Display logged data
            this.idContainer.appendChild(logItem);
        });
        this.displayLogCount(); // Update attendance count display
    }
}

const myMap = new LeafletMap('map', [8.359735, 124.869206], 18);


myMap.loadMarkersFromJson('applet-2.json');

document.addEventListener('DOMContentLoaded', () => {
    myMap.displayLogCount();
    myMap.loadMarkersFromJson('applet-2.json');
});