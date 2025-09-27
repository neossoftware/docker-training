FROM ubuntu:24.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && apt-get install -y \
    python3 \
    python3-pip \
    apache2 \
    && apt-get clean

COPY index.html /var/www/html/
COPY bootstrap-5.0.2-examples /var/www/html/bootstrap-5.0.2-examples

EXPOSE 80

CMD ["apachectl", "-D", "FOREGROUND"]


