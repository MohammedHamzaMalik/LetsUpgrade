let targets=[{
    name:'Mark',
    age :24,
    city : 'US',
    salary : 2000000,
},
{
    name: 'Elon',
    age : 21,
    city : 'USA',
    salary : 1500000,
},
{
    name: 'Ambani',
    age : 34,
    city : 'Mumbai',
    salary : 500000,
},
{
    name: 'Nas',
    age : 35,
    city : 'Singapore',
    salary : 250000,
}];


function display(targets){
    let target_data='';
    let c=1;
   
    targets.forEach(function(element,index){
        let presetrow=`<tr>
                <td>${c}</td>
                <td>${element.name}</td>
                <td>${element.age}</td>
                <td>${element.city}</td>
                <td>${element.salary}</td>
                <td><button onclick="delete_ele(${index})" class="del_btn">delete</button></td>`;

                


        target_data+=presetrow;



    c++;
    });
    document.getElementById('tablerows').innerHTML = target_data;  
};

function insert(e){
    e.preventDefault()
    let target={};
    let ins_name=document.getElementById("ins-name").value;
    let ins_age = document.getElementById("ins-age").value;
    let ins_city = document.getElementById("ins-city").value;
    let ins_salary= document.getElementById("ins-salary").value;
    target.name=ins_name;
    target.age = Number(ins_age);
    target.city = ins_city;
    target.salary =Number(ins_salary);
    console.log(ins_salary);
    
    targets.pop(target);
    display(targets);
return false;
}

display(targets);

function search()
{
  let ser_ele= document.getElementById("searching").value;
 let ser_res_arr=targets.filter(function(targets){
     if (targets.name.indexOf(ser_ele) != -1)
     {
       return targets.name.indexOf(ser_ele) != -1;
     }
     else if (targets.city.indexOf(ser_ele) != -1){
         return targets.city.indexOf(ser_ele) != -1;
           

     }
     ;

 })

 display(ser_res_arr);

}

function delete_ele(index){
    console.log(index);
    targets.splice(index,1);
    display(targets);
    

}