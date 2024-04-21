# Add spring security

## Lakukang config di application.properties
###  configuration spring security user

Jadi jika kita tambahkan spring security ke dalam pom.xml kita maka sebelum bisa akses ke dalam router website kita, kita diwajibkan untuk memasukkan user dan password secara default username adalah user dan password automaticly generated password di log pada saat aplikasi di running. 

Sedangkan jika ingin menggsetting username dan password sesuai dengan kita maka kita perlu melakukan configurasi didalam pom.xml dengan ditambahkan : 

```python
spring.security.user.name=foo
spring.security.user.password=foo
```