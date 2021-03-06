Rails.application.routes.draw do
  namespace :admins_backoffice do
    get 'welcome/index' #Dashboard
    resources :admins
    resources :subjects 
    resources :questions 
  end
  namespace :site do
    get 'welcome/index'
  end
  namespace :users_backoffice do
    get 'welcome/index'
  end
  devise_for :users
  devise_for :admins
  get 'welcome/index'
  get 'home', to: 'site/welcome#index'

  root to: 'site/welcome#index'
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
