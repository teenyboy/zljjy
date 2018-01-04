var POLICY = window.NameSpace || {};

(function(){
   POLICY.queryPolicy = function () {
       $.ajax({
           url:"/policy/queryPolicy",
           success:function (data) {
               console.log(data);
               for(var i = 0;i<data.length;i++){
                   var policyHtml ='<li><a href=\"#\"><img src=\"'+data[i].imgPath+'\"/><h2>'+data[i].abbre+'</h2> <p>'+data[i].content+'</p></a></li>';
                   $("#policiesList").append(policyHtml);
               }
               $('#policiesList').listview('refresh');
           }
       })
   }
})();