package org.hakandereli.restful._01.notes;

public class Notes {
}


/**
 * WEB SERVICE:
 * Interoperating (birlikte çalışma) kavramından ortaya çıkmıştır.
 * Bir uygulamamız var java da yazılmış olsun bir tane de python da bir tane de .net de bu 3 uygulamanın haberleşmesi
 * web serviceler ile yapılabilir.
 *
 * İlla farklı programlama dili olmalı değil bir dilde eski sürümde yazılmış olabilir farklı yapıları kullanıyor olabilir.
 * Kısaca farklı uygulamaların yada yapıların HTTTP veya SOAP protokolü ile haberleşmesidir.
 *
 * Yada dışarıya public bir hizmet açılabilir. Twitter, amazon vs gibi servisler örneğin.
 *
 *
 *
 * Java da 2 Tip Web Servis vardır;
 * 1- JAX-RS
 * 2- JAX-WS
 *
 * Bunlar Java EE bir parçasıdır. Spring de ise bu yapı baz alınarak kurulmuş bir frameworktur.
 *
 * ###
 * JAX-RS
 *  Java API for RESTful web services
 *
 *
 *  JAX-RS implementations
 *  1-Jersey
 *  2-RESTeasy
 *  3-Restlet
 *  4-Apache CXF
 *
 *  ####
 *  REST
 *
 *  2000 yılı , Roy Fielding , doktora tezinden ortaya çıkmıştır.
 *
 *  Representation State Transfer anlamında gelmektedir.
 *
 *  HTTP - bir tcp protokülüdür. Alıcı verici arasındaki iletişimi sağlar.
 *
 *
 *  ####
 *  RESTfFul Architectural Principles
 *
 *  $ Addressability / Addressable resources
 *
 *  Kaynaklara (resourse) erişim unique / tekil bir identifier ile ulaşılabilir olmalıdır.
 *  her kaynak , URI(uniform resource identifier) ile adreslenebilir olmalıdır.
 *
 *  scheme://host:port/path?queryString#fragment
 *  scheme -> kullanılan protokol : http, https, ftp
 *  host   -> dns adi yada ip adresi olabilir.
 *  port   -> optional
 *  path ve queryString
 *
 *  http://example.com/customers?lastName=Dereli&zipCode=34100
 *
 *  Tekil bir adres ile ulaşılabilir olmalıdır addressabilty bu demek
 *
 *  $ Representation Oriented
 *  representation -> xml, json gibi formatlar
 *  representation işaret simge anlamlarına gelir sözlükte buradaki anlamı ise json xml gibi formatlarda haberleşme demektir.
 *
 *
 *  $ The Uniform, Constrained Interface
 *
 *  uri den sil ekle gibi action lar yollama bunun yerine kısıtlanmış interfaceler yani
 *  GET,POST,PUT,DELETE GİBİ yöntemleri kullanmanızı tavsiye eden yöntemdir.
 *
 *  #GET
 *  server dan bir kaynak resourse isteğinde bulunduğumuzda get kullanılırız.
 *
 *  idempotent -> get ile yapılan istekler server da bir şeyi değiştirmeyecek demektir.
 *  yani bir veri okuyorsun örneğin kaç defa yaptığının bir önemi yok sonyuç aynı gelir.
 *
 *
 *  #POST
 *  non-idempotent özelliğe sahiptir.
 *  create için kullanılır.
 *  yapılan istek server da bir şeyler değiştirir. Yapılan istekler sonucunda farklı sonuclar döner.
 *  işlemin kaç defa uygulandığı önemlidir örneğin adam sipariş oluşturduğu url de bir kere kalmalı yenile yaptığında tekrar sipariş oluşturmamalı
 *
 *
 *  #PUT
 *  update güncelleme işlemleri için kullanılmaktadır.
 *  create amacıyla kullanılabilir.
 *  get gibi idempotent özellliğe sahiptir birden fazla çağrıldığında sonuş değişmemeli
 *  bir dosya da bir den fazla ctrl + s yaptıpğını düşün
 *
 *  #DELETE
 *  idempotent özellik gösterir.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * */