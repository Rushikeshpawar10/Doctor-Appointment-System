import { useReducer } from "react";
import {  useNavigate } from "react-router-dom";

export default function AddScheduleComp(){


    const doctorId=JSON.parse(localStorage.getItem("loggedDoctor")).doctor_id;

    const init = {
        doctor_id:{value:doctorId,touched:false,valid:true,error:""},
        date:{value:"",touched:false,valid:false,error:""},
        start_time:{value:"",touched:false,valid:false,error:""},
        end_time:{value:"",touched:false,valid:false,error:""},
        formvalid:false
    }

    const validateData = (name,value) => {
        let valid = false;
        let error = "";
        switch(name) {
            case 'date':   var d=new Date(value);
                            if(d>new Date())
                              {
                                 valid = true;
                                 error = "";
                              }
                              else
                              {
                                 valid = false;
                                 error = "Please select valid date..."
                              }
                              break;
            case 'start_time': var st="08:59:00";
                               var et="22:01:00";
                              if(value>st && value<et)
                              {
                                valid = true;
                                error = "";
                               }
                               else
                               {
                                valid = false;
                                error = "Please select valid time...";
                               }
                              break;
            case 'end_time': var st="08:59:00";
                             var et="22:01:00";
                             if(value>st && value<et && value>info.start_time.value)
                             {
                               valid = true;
                               error = "";
                              }
                              else
                              {
                               valid = false;
                               error = "Please select valid time...";
                              }
                             break;                  
                              
                      }
                              return {valid, error};
    }

    const reducer=(state,action)=>  {
        switch(action.type)
        {
            case 'update':
               const {name, value, touched, valid,error,formvalid} = action.data
                return {...state, [name]: {value, touched, valid, error},formvalid}

            case 'reset':
                return init;
        }
        
    }
        const [info,dispatch]=useReducer(reducer,init);
        const navigate= useNavigate();
       
        const handleChange = (name,value) => {
            const {valid,error} = validateData(name,value)
            let formvalid=true;

            for(const key in info)
            {
                console.log(key+" : "+info[key].valid )
                if(info[key].valid === false)
                {
                    formvalid = false;
                    break;
                }
            }  
            console.log(info.formvalid)  
            dispatch({type: 'update', data: {name,value,touched: true, valid, error,formvalid} })
        }
        

       const sendData=(e) =>{
            e.preventDefault();
            
            const reqOptions={
                method:'POST',
                headers:{'content-type':'application/json'},
                body:JSON.stringify({
                    doctor_id:info.doctor_id.value,
                    date:info.date.value,
                    start_time:info.start_time.value+":00",
                    end_time:info.end_time.value+":00"
                })
            }

                fetch("http://localhost:8080/addSchedule",reqOptions)
                .then(resp=>{console.log("schedule sent");return resp.text()})
                alert("Schedule added");

                navigate("/doctorhome");
            
            
        }

    return(
        <div>
             <div class="mask d-flex align-items-center h-100 gradient-custom-3">
              <div class="container h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                  <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                    <div class="card" >
                      <div class="card-body p-5">
                        <h2 class="text-uppercase text-center mb-5">Add Schedule</h2>

                        <form>
                                <div class="form-outline mb-4">
                                    <label class="form-label" for="date">Date :</label>
                                    <input type="date" id="date" placeholder="Enter date" name="date" value={info.date.value} class="form-control form-control-lg"
                                    onChange={(e)=>handleChange("date",e.target.value)}/>
                                    <div className="error-msg" style={{color:"red"}}> {info.date.error}</div> 
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="start_time">Start Time</label>
                                    <input type="time" id="start_time" placeholder="Enter start time" name="start_time" value={info.start_time.value} class="form-control form-control-lg" 
                                         onChange={(e)=>handleChange("start_time",(e.target.value))}/>
                                         <div className="error-msg" style={{color:"red"}}> {info.start_time.error}</div> 
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="end_time">End Time</label>
                                    <input type="time" id="end_time" placeholder="Enter end_time" name="end_time" value={info.end_time.value} class="form-control form-control-lg" 
                                        onChange={(e)=>handleChange("end_time",(e.target.value))}/>
                                        <div className="error-msg" style={{color:"red"}}> {info.end_time.error}</div> 
                                </div>

                                <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                    <button type="reset" class="btn btn-light btn-lg" onClick={()=>{dispatch({type:'reset'})}}>Reset</button>
                                    <button type="submit" class="btn btn-warning btn-lg ms-2"  onClick={(e)=>{sendData(e)}}>Submit</button>
                                </div>
                        </form>

                       </div>
                     </div>
                  </div>
               </div>
             </div>
           </div>

                    <p>{JSON.stringify(info)}</p>
                    {JSON.stringify({
                    doctor_id:info.doctor_id.value,
                    date:info.date.value,
                    start_time:info.start_time.value+":00",
                    end_time:info.end_time.value+":00"
                })}
        </div>
    )
}