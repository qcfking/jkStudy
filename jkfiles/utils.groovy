echo "utils begin..."
def cfg=readProperties file:"jkfiles/cfg.properties"
def a = cfg['name']
echo "${a}"
def getCfg() {
    cfg;
}
echo "utils end.."
this
