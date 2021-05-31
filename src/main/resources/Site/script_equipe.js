var $target = $('.card-equipe'),
    $target2 = $('.card-equipe2'),
    animationClass = 'card-anime-start';

function animeScroll(){
    var documentTop = $(document).scrollTop();
    
    $target.each(function() {

            $(this).addClass(animationClass);
        
    })

    $target2.each(function() {

            $(this).addClass(animationClass);
        
    })
}

animeScroll();