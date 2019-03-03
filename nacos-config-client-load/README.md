## profile

2019-03-03 12:44:29.040  INFO 23952 --- [-127.0.0.1_8848] o.s.c.a.n.c.NacosPropertySourceBuilder   : Loading nacos data, dataId: 'nacos-config-client-load.yml', group: 'DEFAULT_GROUP'
2019-03-03 12:44:29.044  INFO 23952 --- [-127.0.0.1_8848] o.s.c.a.n.c.NacosPropertySourceBuilder   : Loading nacos data, dataId: 'nacos-config-client-load-dev.yml', group: 'DEFAULT_GROUP'

- 优先使用配置是 applicationname-profile
- 不存在时读取 applicationname

## GROUP
- 默认没有组 都是放在DEFAULT_GROUP

## namespace
