import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
    },
    {
      path: '/about',
      name: 'about',
      // 路由级别代码分割
      // 这会为此路由生成一个单独的块（About.[hash].js）
      // 当访问路线时，它是延迟加载的。
      // 这样可以提高性能
      component: () => import('../views/AboutView.vue'),
    },
  ],
})
//router实例被导出，在其他地方可以应用
export default router
