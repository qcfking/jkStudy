echo "utils begin..."

def getCfg(id) {
    def cfg=readProperties file:"jkfiles/cfg.properties"
    echo "${cfg["name"]}"
    cfg;
}

echo "utils end.."
this
