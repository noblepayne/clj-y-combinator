[:html
 [:head
  [:link {:rel "stylesheet" :type "text/css" :href "https://storage.googleapis.com/app.klipse.tech/css/codemirror.css"}]
  [:script
   "window.klipse_settings = {selector: '.language-klipse'};"]]
 [:meta {:charset "utf-8"}]
 [:body
  [:div 
   [:code.language-klipse
"(def factorial
  (let [f1 (fn [!]
             (fn [n]
               (let [f2 (! !)]
                 (f2 n)))) 
        f3 (fn [!]
             (fn [n]
               (let [f4 (! !)]
                 (if (zero? n)
                   1 
                   (* n (f4 (dec n)))))))]
    (f1 f3)))"
   ]]
  [:script {:src "https://storage.googleapis.com/app.klipse.tech/plugin/js/klipse_plugin.js"}]]]
