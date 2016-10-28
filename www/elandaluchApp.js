
var exec = require('cordova/exec');

var PLUGIN_NAME = 'LauchApp';

var LaunchAppPlugin = {
  launch_app: function(sucess, failure) {
    exec(sucess, failure, PLUGIN_NAME, 'launch_app', []);
  }
};

module.exports = LaunchAppPlugin;
