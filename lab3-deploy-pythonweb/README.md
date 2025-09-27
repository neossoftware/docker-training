## Setup Steps

First Create Virtual environment

```
python3 -m venv .venv

source .venv/bin/activate

pip3 install -r requirements.txt

pip3 list
```

## Now need to transfor from local execution to docker file

```
FROM python:3.12-slim

WORKDIR /app
COPY requirements.txt .
RUN pip3 install -r requirements.txt

ENV FLASK_DEBUG=True

COPY . .
EXPOSE 3000
CMD ["python", "app/main.py"]
```

