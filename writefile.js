var fs=require("fs");
var data="Hello World";

fs.writeFile("hello.txt",data,function(err){
    if(err) throw err;
    console.log("Write file succesfuly...!");
})