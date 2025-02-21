from fastapi import FastAPI


app = FastAPI()




@app.get("/")
async def root():
   return {"message": "Hello World"}




@app.get("/greet/{name}")
def greet(name):
   return {"message": f"Hello {name}"}




users = ["jordi", "theo", "jhlkjfdg"]




@app.get("/search")
def search_user(name):
   # def sear_user(name,msg):
   if name in users:
       return {"message": f"Hi {name}"}
   # returh {"message": f"Hi{name},{msg}"} --> esto se hace en query de visual studio code
   else:
       return {"user not found"}




# dicts, lists, todo en general
users2 = [
   {"name": "joan", "email": "joan@gmail.com"},
   {"name": "pepe", "email": "pepe@gmail.com"}
]




# es como si el compuesto fuese como void
@app.post("/create_user")
def create_user(user: dict):
   print(user)
   #    new_user = {
   #        "name": user["name"],
   #        "email": user["email"]
   #    }


   #    users2.append(new_user)
   #    print(users2)


   return {"messege": "user created successfully"}

