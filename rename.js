var fs=require("fs");
fs.rename("hello.txt","Hello.txt",function(err){
    if(err) throw err;
    console.log("rename succesfuly");
})