<%@ page contentType="text/html; charset=utf-8"%>
<jsp:directive.include file="/WEB-INF/views/include/taglibs.jsp"/>
<html>
<head>
<title>Example: Full - jWYSIWYG</title>
<link rel="stylesheet" type="text/css" href='<c:url value="/css/wysiwyg/blueprint/screen.css"/>' media="screen, projection" />
<link rel="stylesheet" type="text/css" href='<c:url value="/css/wysiwyg/blueprint/print.css"/>' media="print" />
<!--[if lt IE 8]><link rel="stylesheet" href='<c:url value="/css/wysiwyg/blueprint/ie.css"/>' type="text/css" media="screen, projection" /><![endif]-->
<link rel="stylesheet" href='<c:url value="/css/wysiwyg/jquery.wysiwyg.css"/>' type="text/css"/>
<script type="text/javascript" src='<c:url value="/js/common/jquery-2.0.3.js"/>'></script>
<script type="text/javascript" src='<c:url value="/js/wysiwyg/jquery.wysiwyg.js"/>'></script>
<script type="text/javascript" src='<c:url value="/js/wysiwyg/wysiwyg.image.js"/>'></script>
<script type="text/javascript" src='<c:url value="/js/wysiwyg/wysiwyg.link.js"/>'></script>
<script type="text/javascript" src='<c:url value="/js/wysiwyg/wysiwyg.table.js"/>'></script>
<script type="text/javascript">
(function($) {
	$(document).ready(function() {
		$('#wysiwyg').wysiwyg({
		  controls: {
			bold          : { visible : true },
			italic        : { visible : true },
			underline     : { visible : true },
			strikeThrough : { visible : true },
			
			justifyLeft   : { visible : true },
			justifyCenter : { visible : true },
			justifyRight  : { visible : true },
			justifyFull   : { visible : true },

			indent  : { visible : true },
			outdent : { visible : true },

			subscript   : { visible : true },
			superscript : { visible : true },
			
			undo : { visible : true },
			redo : { visible : true },
			
			insertOrderedList    : { visible : true },
			insertUnorderedList  : { visible : true },
			insertHorizontalRule : { visible : true },

			h4: {
				visible: true,
				className: 'h4',
				command: ($.browser.msie || $.browser.safari) ? 'formatBlock' : 'heading',
				arguments: ($.browser.msie || $.browser.safari) ? '<h4>' : 'h4',
				tags: ['h4'],
				tooltip: 'Header 4'
			},
			h5: {
				visible: true,
				className: 'h5',
				command: ($.browser.msie || $.browser.safari) ? 'formatBlock' : 'heading',
				arguments: ($.browser.msie || $.browser.safari) ? '<h5>' : 'h5',
				tags: ['h5'],
				tooltip: 'Header 5'
			},
			h6: {
				visible: true,
				className: 'h6',
				command: ($.browser.msie || $.browser.safari) ? 'formatBlock' : 'heading',
				arguments: ($.browser.msie || $.browser.safari) ? '<h6>' : 'h6',
				tags: ['h6'],
				tooltip: 'Header 6'
			},
			
			cut   : { visible : true },
			copy  : { visible : true },
			paste : { visible : true },
			html  : { visible: true },
			increaseFontSize : { visible : true },
			decreaseFontSize : { visible : true },
			exam_html: {
				exec: function() {
					this.insertHtml('<abbr title="exam">Jam</abbr>');
					return true;
				},
				visible: true
			}
		  },
		  events: {
			click: function(event) {
				if ($("#click-inform:checked").length > 0) {
					event.preventDefault();
					alert("You have clicked jWysiwyg content!");
					$('#wysiwyg').wysiwyg("insertHtml", "aaaaaaaaaaaaaaaaaaaaaa");
				}
			}
		  }
		});
		//$('#wysiwyg').wysiwyg("insertHtml", "Sample code");
		
	});
})(jQuery);
</script>
</head>
<body>
<div class="container">
	<h1>jWYSIWYG</h1>
	<h2>Example: Full</h2>
	<h2>사진을 게시판에 드레그엔 드랍을 하면 /apiProxy 가호출되 upload폴더에 이미지 업로드</h2>
	<noscript>Enable JavaScript to use WYSIWYG features.</noscript>
	<textarea id="wysiwyg" rows="5" cols="103"></textarea>
	<label><input type="checkbox" value="1" id="click-inform" /> Inform about clicks.</label>

</div>
<style>
progress { width: 100%; }
progress:after { content: '%'; }
.fail { background: #c00; padding: 2px; color: #fff; }
.hidden { display: none !important;}
</style>
  <p id="upload" class="hidden"><label>Drag & drop not supported, but you can still upload via this input field:<br><input type="file"></label></p>
  <p id="filereader">File API & FileReader API not supported</p>
  <p id="formdata">XHR2's FormData is not supported</p>
  <p id="progress">XHR2's upload progress isn't supported</p>
  <p>Upload progress: <progress id="uploadprogress" min="0" max="100" value="0">0</progress></p>
  <p>Drag an image from your desktop on to the drop zone above to see the browser both render the preview, but also upload automatically to this server.</p>
<script>
function show(img){
	$('#wysiwyg').wysiwyg("insertHtml", img);
  }
</script>
</body>
</html>
