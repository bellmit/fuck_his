var datas={};
$(document).ready(function(){
    $.ajax({
       type: "GET",
       url: "./list/apartment",
       dataType: "json",
       success: function (res) {
          console.log(res);
          datas=res.data;
      },
      error: function (res) {
          console.log(res);
      }
  });      
});
$('#apartment').on('change',function () {
    var text =$('#apartment').val();
    // console.log(datas);
    if(text=="内科"){
        console.log(text);
        $("#part").empty();
        $('#part').append('<option value="急诊科（含普通内科病区）">急诊科（含普通内科病区）</option>');
        var value=$('#part option:first').val();
        console.log(value);
        $("#part").val(value);
    }
    if(text=="内科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>1&&datas[i].apartmentId<2){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="外科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>2&&datas[i].apartmentId<3){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="妇科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>3&&datas[i].apartmentId<4){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="骨科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>4&&datas[i].apartmentId<5){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="肿瘤科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>5&&datas[i].apartmentId<6){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="皮肤科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>6&&datas[i].apartmentId<7){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="针灸科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>7&&datas[i].apartmentId<8){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="推拿科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>8&&datas[i].apartmentId<9){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="儿科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>9&&datas[i].apartmentId<10){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="护理科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>10&&datas[i].apartmentId<11){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="麻醉科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>11&&datas[i].apartmentId<12){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="口腔科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>12&&datas[i].apartmentId<13){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="耳鼻喉科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>13&&datas[i].apartmentId<14){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
    if(text=="眼科"){
        console.log(text);
        $("#part").empty();
        for(var i=0;i<datas.length;i++){
            if(datas[i].apartmentId>14&&datas[i].apartmentId<15){
                // console.log(datas[i].apartmentName);
                $('#part').append('<option value="'+ datas[i].apartmentName +'">' + datas[i].apartmentName + '</option>');
                // $('#part').options[0].selected = true;
            }
        }
        var value=$('#part option:first').val();
        console.log(value);
         $("#part").val(value);
    }
});