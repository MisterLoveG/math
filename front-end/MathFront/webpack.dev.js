var webpack = require("webpack");
var merge = require("webpack-merge");
var path = require("path");

var kotlinPath = path.resolve(__dirname, "build/classes/kotlin/main");
module.exports = merge(require("./webpack.common.js"), {
    devtool: "inline-source-map",
    resolve: {
        modules: [path.resolve(kotlinPath, "dependencies/")]
    },
    devServer: {
        contentBase: "./src/main/web/",
        port: 9000,
        hot: true
    },
    plugins: [
        new webpack.HotModuleReplacementPlugin(),
        new webpack.ProvidePlugin({
            $: 'jquery',
            jQuery: 'jquery'
        })
    ]
});