# elk-stack-demo
How to perform centralize logging in microservice architecture using ELK Stack

###### Download ELK Binary Distrubution

###### 1.Elastic Search [Download](https://www.elastic.co/downloads/elasticsearch).
###### 2.Logstash [Download](https://www.elastic.co/downloads/kibana).
###### 3.Kibana [Download](https://artifacts.elastic.co/downloads/logstash/logstash-7.6.2.zip).


1.	Go to C:\Softwares\ELK\elasticsearch-8.17.1\bin
	Run in CMD: elasticsearch -E xpack.security.enabled=false

2.	Go to C:\Softwares\ELK\kibana-8.17.1\bin
	Run in CMD: kibana.bat

3.	Follow : https://www.elastic.co/downloads/logstash
	Put conf file inside: C:\Softwares\ELK\logstash-8.17.1
	Run: logstash -f logstash.conf
