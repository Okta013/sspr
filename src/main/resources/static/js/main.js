$(function(){

        var field = new Array("surname", "firstName", "phone","message");

        $("form").submit(function() {
            var error=0;
            $("form").find(":input").each(function() {
                for(var i=0;i<field.length;i++){
                    if($(this).attr("name")==field[i]){

                        if(!$(this).val()){
                            $(this).css('border', 'red 1px solid');
                            error=1;

                        }
                        else{
                            $(this).css('border', 'gray 1px solid');
                        }

                    }
                }
           })


            if(error==0){
                alert("Ваше обращение принято!");
                return true;
            }
            else{
            if(error==1) var err_text = "Не все обязательные поля заполнены!";
            $(".messenger").html(err_text);
            $(".messenger").fadeIn("slow");
            return false;
            }


        })
    });

