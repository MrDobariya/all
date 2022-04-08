var fs=require("fs");
var data="\n Earth";

fs.appendFile("hello.txt",data,function(err){
    if (err) throw err;
    console.log("appdend succesfuly");
})