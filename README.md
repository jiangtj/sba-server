# SBA Server

```shell
docker run --name sba-server --restart=unless-stopped -p 8765:8765 -v ./sba-server-config.properties:config.properties -d jiangtj/sba-server
```
