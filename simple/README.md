# simple k8s demo

----
see:
[consumer](../simple-consumer)
[supplier](../simple-supplier)
---
## step:
1. package
   > consumer
    ```
    cd ../simple-consumer
    mvn package
    ```
   > supplier
    ```
    cd ../simple-supplier
    mvn package
    ```
1. copy file
   > consumer
   ```
   cp ../simple-consumer/target/simple-consumer-1.0-SNAPSHOT ../simple-consumer/docker/simple-consumer-1.0-SNAPSHOT
   ```
   > supplier
   ```
   cp ../simple-supplier/target/simple-supplier-1.0-SNAPSHOT ../simple-supplier/docker/simple-supplier-1.0-SNAPSHOT
   ```
1. build docker image.
    > consumer
    ```
    cd ../simple-consumer/docker
    docekr build -t k8s-consumer:v1
    ```
    > supplier
    ```
    cd ../simple-supplier/docker
    docekr build -t k8s-supplier:v1
    ```
1. apply k8s
    ```
   cd k8s
   kubectl apply -f .
   ```
----
## test

http://localhost:30000/consumer

result:
> consumer

http://localhost:30000/supplier

result:
> consumer's supplier