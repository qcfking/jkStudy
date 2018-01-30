def props = readProperties file:'./jkfiles/cfg.properties'
def Var1= props['name']
def Var2= props['age']
echo "Var1=${Var1}"
echo "Var2=${Var2}"
this