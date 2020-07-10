###Login in to AWS MAC:
- ```export AWS_PROFILE=saml```
- ```saml2aws login```
- ```aws configure list``` (to verify if the key are there)

      Name                    Value             Type    Location
      ----                    -----             ----    --------
   profile                     saml           manual    --profile
access_key     ****************IINY shared-credentials-file
secret_key     ****************m+dC shared-credentials-file
    region                               config-file    ~/.aws/config
    
    - ```vi ~/.aws/credentials``` (add region = ap-southeast-2)
- ```aws configure list```

      Name                    Value             Type    Location
      ----                    -----             ----    --------
   profile                     saml           manual    --profile
access_key     ****************IINY shared-credentials-file
secret_key     ****************m+dC shared-credentials-file
    region           ap-southeast-2      config-file    ~/.aws/config

- ```aws ec2 describe-instances``` (should retreve instances -- it is working)

###Build docker Image:
```docker build -t kafka-consumer-poc -f ./docker/Dockerfile .```

###Run Docker image:
```docker run -it -v ~/.aws:/root/.aws:ro -e AWS_REGION=ap-southeast-2 -e AWS_PROFILE=saml -e KAFKA_CONSUMER_DOMAIN_NAME=smf-cbb-se-event-controller.int.ts.dev.sbet.cloud -e APPLICATION=smf-cbb-gameui -e SECRETS_MANAGER_PREFIX=/app/smf-cbb -e SECRETS_MANAGER_SERVICE_NAME=gameui -e PARAMETER_STORE_PREFIX=/app/smf-cbb -e PARAMETER_STORE_SERVICE_NAME=gameui kafka-consumer-poc```

###GraphQL client tp send games:
http://localhost:8080/gui
