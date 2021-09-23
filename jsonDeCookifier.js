function jsonDeCookifier(name){

    let cookies = document.cookie;
    //console.log(name)
    if(cookies.length != 0){

        let cookieArray = cookies.split("=");
        //console.log(cookieArray);
        for(var i = 0; i < cookieArray.length - 1; i += 2){

        let cookieName = cookieArray[i];
        //console.log(i);
        //console.log(cookieName);

            if(cookieName = name){

                let uglyCookie = cookieArray[i + 1];
                let lessUglyCookie = uglyCookie.replace(/\\/g,'');
                let prettyCookie = lessUglyCookie.slice(1, lessUglyCookie.length - 1);

                let yoJson = JSON.parse(prettyCookie);

                return yoJson;
            }
        }
    }else return null;
 }

console.log(jsonDeCookifier('name_of_cookie_goes_here'));
    

    //console.log(cookieArray);
    //console.log(uglyCookie);
/*    console.log(lessUglyCookie);
    console.log(prettyCookie);
    console.log("here's your JSON: " + yoJson);
    console.log(JSON.parse(prettyCookie))*/


