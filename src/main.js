// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import 'muse-ui/lib/styles/base.less'
import { BottomNav, Paper, Progress, Select } from 'muse-ui'
import 'muse-ui/lib/styles/theme.less'

Vue.config.productionTip = false

Vue.use(BottomNav)
Vue.use(Paper)
Vue.use(Progress)
Vue.use(Select)
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})