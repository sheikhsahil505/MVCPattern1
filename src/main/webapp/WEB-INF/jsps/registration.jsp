<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">


</head>
<body>
<form action="formdata" method="post">
 <section class="vh-100 gradient-custom">
   <div class="container py-5 h-100">
     <div class="row justify-content-center align-items-center h-100">
       <div class="col-12 col-lg-9 col-xl-7">
         <div class="card shadow-2-strong card-registration" style="border-radius: 15px;">
           <div class="card-body p-4 p-md-5">
             <h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Registration Form</h3>
             <form>

               <div class="row">
                 <div class="col-md-6 mb-4">

                   <div class="form-outline">
                     <input type="text" id="firstName" class="form-control form-control-lg" name="Fname"/>
                     <label class="form-label" for="firstName">First Name</label>
                   </div>

                 </div>
                 <div class="col-md-6 mb-4">

                   <div class="form-outline">
                     <input type="text" id="lastName" class="form-control form-control-lg" name="Lname"/>
                     <label class="form-label" for="lastName">Last Name</label>
                   </div>

                 </div>
               </div>

               <div class="row">
                 <div class="col-md-6 mb-4 d-flex align-items-center">

                   <div class="form-outline datepicker w-100">
                     <input type="date" class="form-control form-control-lg" id="birthdayDate" name="dob"/>
                     <label for="birthdayDate" class="form-label">Birthday</label>
                   </div>

                 </div>
                 <div class="col-md-6 mb-4">

                   <h6 class="mb-2 pb-1">Gender: </h6>
                  <div class="form-check form-check-inline">
                     <input class="form-check-input" type="radio" name="inlineRadioOptions" id="otherGender"
                       value="Others" />
                     <label class="form-check-label" for="otherGender">Other</label>
                   </div>

                   <div class="form-check form-check-inline">
                     <input class="form-check-input" type="radio" name="inlineRadioOptions" id="femaleGender"
                       value="Female"  />
                     <label class="form-check-label" for="femaleGender">Female</label>
                   </div>

                   <div class="form-check form-check-inline">
                     <input class="form-check-input" type="radio" name="inlineRadioOptions" id="maleGender"
                       value="Male" checked/>
                     <label class="form-check-label" for="maleGender">Male</label>
                   </div>


                 </div>
               </div>

               <div class="row">
                 <div class="col-md-6 mb-4 pb-2">

                   <div class="form-outline">
                     <input type="email" id="emailAddress" class="form-control form-control-lg" name="email" />
                     <label class="form-label" for="emailAddress">Email</label>
                   </div>

                 </div>
                 <div class="col-md-6 mb-4 pb-2">

                   <div class="form-outline">
                     <input type="tel" id="phoneNumber" class="form-control form-control-lg" name="mobile"/>
                     <label class="form-label" for="phoneNumber">Phone Number</label>
                   </div>

                 </div>
               </div>

               <div class="row">
                 <div class="col-12">

                   <select class="select form-control-lg"name="course">
                    <option value="null" disabled>Choose option</option>
                     <option value="B.Tech">B.Tech</option>
                     <option value="B.com">B.Com</option>
                     <option value="BCA">BCA</option>
                     <option value="MBA">MBA</option>
                   </select>
                   <label class="form-label select-label">Course</label>

                 </div>
               </div>

               <div class="mt-4 pt-2">
                 <input class="btn btn-primary btn-lg" type="submit" value="Submit" />
                  <a class="btn btn-success btn-lg" type="button" href= "listAll">List All</a>
               </div>

             </form>
           </div>
         </div>
       </div>
     </div>
   </div>
 </section>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

</body>     <style>   .gradient-custom {
                      /* fallback for old browsers */
                      background: #f093fb;

                      /* Chrome 10-25, Safari 5.1-6 */
                      background: -webkit-linear-gradient(to bottom right, rgba(240, 147, 251, 1), rgba(245, 87, 108, 1));

                      /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
                      background: linear-gradient(to bottom right, rgba(240, 147, 251, 1), rgba(245, 87, 108, 1))
                      }

                      .card-registration .select-input.form-control[readonly]:not([disabled]) {
                      font-size: 1rem;
                      line-height: 2.15;
                      padding-left: .75em;
                      padding-right: .75em;
                      }
                      .card-registration .select-arrow {
                      top: 13px;
                      }
            </style>
</html>