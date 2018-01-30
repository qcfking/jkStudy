echo "utils begin..."

def getCfg() {
    def cfg=readProperties file:"jkfiles/cfg.properties"
    def a = cfg['name']
    echo "${a}"
    cfg;
}

echo "utils end.."
this
