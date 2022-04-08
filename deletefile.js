var fs=require("fs");
fs.unlink("hello.txt",function(err){
    if(err) throw err;
    console.log("unlink succesfuly");
})