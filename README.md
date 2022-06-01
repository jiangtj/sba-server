# SBA Server

```shell
docker run --name sba-server --restart=unless-stopped -p 8765:8765 -v ./sba-server.properties:/config.properties -d jiangtj/sba-server
```
