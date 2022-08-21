http://localhost:8080/actuator/health

{
"status": "UP",
"groups": [
"custom"
]
}


{
"_links": {
"self": {
"href": "http://localhost:8080/actuator",
"templated": false
},
"beans": {
"href": "http://localhost:8080/actuator/beans",
"templated": false
},
"caches": {
"href": "http://localhost:8080/actuator/caches",
"templated": false
},
"caches-cache": {
"href": "http://localhost:8080/actuator/caches/{cache}",
"templated": true
},
"health": {
"href": "http://localhost:8080/actuator/health",
"templated": false
},
"health-path": {
"href": "http://localhost:8080/actuator/health/{*path}",
"templated": true
},
"info": {
"href": "http://localhost:8080/actuator/info",
"templated": false
},
"conditions": {
"href": "http://localhost:8080/actuator/conditions",
"templated": false
},
"configprops": {
"href": "http://localhost:8080/actuator/configprops",
"templated": false
},
"configprops-prefix": {
"href": "http://localhost:8080/actuator/configprops/{prefix}",
"templated": true
},
"env-toMatch": {
"href": "http://localhost:8080/actuator/env/{toMatch}",
"templated": true
},
"env": {
"href": "http://localhost:8080/actuator/env",
"templated": false
},
"loggers-name": {
"href": "http://localhost:8080/actuator/loggers/{name}",
"templated": true
},
"loggers": {
"href": "http://localhost:8080/actuator/loggers",
"templated": false
},
"heapdump": {
"href": "http://localhost:8080/actuator/heapdump",
"templated": false
},
"threaddump": {
"href": "http://localhost:8080/actuator/threaddump",
"templated": false
},
"metrics-requiredMetricName": {
"href": "http://localhost:8080/actuator/metrics/{requiredMetricName}",
"templated": true
},
"metrics": {
"href": "http://localhost:8080/actuator/metrics",
"templated": false
},
"scheduledtasks": {
"href": "http://localhost:8080/actuator/scheduledtasks",
"templated": false
},
"mappings": {
"href": "http://localhost:8080/actuator/mappings",
"templated": false
}
}
}